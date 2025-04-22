package edu.uth.wed_san_pham_cham_soc_da.Controllers;

import edu.uth.wed_san_pham_cham_soc_da.models.Account;
import edu.uth.wed_san_pham_cham_soc_da.models.Pay;
import edu.uth.wed_san_pham_cham_soc_da.models.OrderDetail;
import edu.uth.wed_san_pham_cham_soc_da.models.ShoppingCart;
import edu.uth.wed_san_pham_cham_soc_da.repository.ShoppingCartRepository;
import edu.uth.wed_san_pham_cham_soc_da.Service.AccountServiceiml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import edu.uth.wed_san_pham_cham_soc_da.Service.PayService;

import java.security.Principal;
import java.util.List;


@Controller
@RequestMapping("/pay")
public class PayControllers {

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @Autowired
    private AccountServiceiml accountService;


    @Autowired
    private PayService payService;

    // Hiển thị trang thanh toán với thông tin giỏ hàng và thông tin khách hàng đã đăng nhập
    @GetMapping
    public String showPaymentPage(Model model, Principal principal) {
        // Lấy thông tin tài khoản đang đăng nhập
        String username = principal.getName();
        Account account = accountService.findByUsername(username);

        // Lấy danh sách sản phẩm trong giỏ hàng theo tài khoản
        List<ShoppingCart> cartItems = shoppingCartRepository.findByAccount(account);

        // Tính tổng tiền
        long total = cartItems.stream()
                .mapToLong(item -> item.getPrice() * item.getQuantity())
                .sum();

        // Tạo đối tượng Pay và gán thông tin khách hàng từ Account
        Pay pay = new Pay();
        // Giả sử bạn dùng username làm tên hiển thị, và phone, email từ Account
        pay.setTenKhachHang(account.getUsername());
        pay.setSoDienThoai(account.getPhone());
        pay.setEmail(account.getEmail());
        // Nếu có thêm thông tin khác, bạn có thể gán thêm

        // Đưa dữ liệu lên view
        model.addAttribute("cartItems", cartItems);
        model.addAttribute("total", total);
        model.addAttribute("account", account);
        model.addAttribute("pay", pay);

        return "pay"; // trả về file pay.html trong thư mục templates
    }

    // Xử lý thanh toán sau khi submit form
    @PostMapping
    public String processPayment(@ModelAttribute("pay") Pay pay, Model model, Principal principal) {
        String username = principal.getName();
        Account account = accountService.findByUsername(username);
        List<ShoppingCart> cartItems = shoppingCartRepository.findByAccount(account);

        if (cartItems.isEmpty()) {
            model.addAttribute("error", "Giỏ hàng của bạn đang trống!");
            return "pay";
        }

        // Gọi service xử lý thanh toán và lưu đơn hàng → nhận lại đối tượng đã lưu
        Pay savedPay = payService.processPayment(account, pay, cartItems);

        // Lấy chi tiết đơn hàng từ đối tượng đã lưu
        List<OrderDetail> orderDetails = savedPay.getOrderDetails();

        // Tính tổng tiền
        long total = cartItems.stream().mapToLong(item -> item.getPrice() * item.getQuantity()).sum();

        // Truyền dữ liệu cho view
        model.addAttribute("order", savedPay);
        model.addAttribute("orderDetails", orderDetails);
        model.addAttribute("total", total);
        model.addAttribute("account", account);

        return "paymentSuccess"; // Trả về trang paymentSuccess.html
    }
}
