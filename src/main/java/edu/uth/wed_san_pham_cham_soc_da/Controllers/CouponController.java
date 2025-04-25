package edu.uth.wed_san_pham_cham_soc_da.Controllers;

import edu.uth.wed_san_pham_cham_soc_da.Service.AccountService;
import edu.uth.wed_san_pham_cham_soc_da.Service.CouponService;
import edu.uth.wed_san_pham_cham_soc_da.Service.ShoppingCartService;
import edu.uth.wed_san_pham_cham_soc_da.models.Account;
import edu.uth.wed_san_pham_cham_soc_da.models.Coupon;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.math.BigDecimal;
import java.security.Principal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


//Controller cho phép người dùng
//Xem danh sách các coupon còn hiệu lực, Áp dụng mã coupon vào giỏ hàng

@Controller
public class CouponController {

    @Autowired // Spring tự động inject CouponService để tương tác với DB và xử lý logic cho coupon
    private CouponService couponService;

    @Autowired
    private ShoppingCartService cartService;

    @Autowired
    private AccountService accountService;

    //Hiển thị trang danh sách coupon
    //đồng thời truyền cartTotal để disable nút nếu chưa đủ điều kiện
    @GetMapping("/coupons")
    public String showCoupons(Model model, Principal principal) {
        // thời điểm hiện tại
        LocalDateTime now = LocalDateTime.now();
        // gọi service lấy coupon hợp lệ
        List<Coupon> available = couponService.findAvailable(now);
        // thêm vào model
        model.addAttribute("coupons", available);
        // Tính tổng giỏ hàng của user
        Account account = accountService.findByUsername(principal.getName());
        double cartTotal = cartService.getTotal(account);
        model.addAttribute("cartTotal", cartTotal);
        return "coupons";  // tới coupons.html
    }

    @PostMapping("/coupons/add")
    //Xử lý việc người dùng nhập và áp dụng mã coupon
    public String applyCoupon(@RequestParam("code") String code,
                              HttpSession session,
                              RedirectAttributes ra,
                              Principal principal) {

        Account account = accountService.findByUsername(principal.getName());
        double cartTotal = cartService.getTotal(account);

        //Tìm coupon theo code
        Optional<Coupon> opt = couponService.findByCode(code);
        //Kiểm tra active và chưa hết hạn
        if (opt.isPresent()) {
            Coupon c = opt.get();
            LocalDateTime now = LocalDateTime.now();
            BigDecimal discount = c.getDiscountAmount();

            if (!c.isActive() || c.getExpiredAt().isBefore(now)) {
                ra.addFlashAttribute("error", "Mã không hợp lệ hoặc đã hết hạn");
            }
            else if (discount.compareTo(BigDecimal.valueOf(50000)) == 0 && cartTotal < 500000) {
                ra.addFlashAttribute("error", "Đơn phải ≥ 500.000 đ để áp dụng mã 50.000 đ");
            }
            else if (discount.compareTo(BigDecimal.valueOf(100000)) == 0 && cartTotal < 1000000) {
                ra.addFlashAttribute("error", "Đơn phải ≥ 1.000.000 đ để áp dụng mã 100.000 đ");
            }
            else {
                session.setAttribute("couponCode", c.getCode());
                session.setAttribute("couponDiscount", discount);
                ra.addFlashAttribute("message", "Áp dụng mã " + code + " thành công!");
            }
        } else {
            ra.addFlashAttribute("error", "Không tìm thấy mã: " + code);
        }
        // Chuyển hướng về trang để hiển thị kết quả
        return "redirect:/shopping-cart";
    }
}
