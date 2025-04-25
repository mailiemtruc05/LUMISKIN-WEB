package edu.uth.wed_san_pham_cham_soc_da.Controllers;

import edu.uth.wed_san_pham_cham_soc_da.Service.CouponService;
import edu.uth.wed_san_pham_cham_soc_da.models.Coupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Controller quản lý giao diện Admin cho Coupon.
 */
@Controller
@RequestMapping("/admin-coupons")
public class AdminCouponController {

    @Autowired
    private CouponService couponService;

    /**
     * Hiển thị trang quản lý coupon (danh sách + form thêm mới)
     */
    @GetMapping
    public String list(Model model) {
        model.addAttribute("coupons", couponService.findAll());
        model.addAttribute("coupon", new Coupon());
        return "admin-coupons";
    }

    /**
     * Xử lý thêm mới coupon (mặc định inactive)
     */
    @PostMapping("/add-new")
    public String saveNew(@ModelAttribute("coupon") Coupon coupon,
                          RedirectAttributes ra) {
        LocalDateTime now = LocalDateTime.now();
        coupon.setCreatedAt(now);
        coupon.setActive(false);
        coupon.setExpiredAt(now.plusDays(30));
        couponService.save(coupon);
        ra.addFlashAttribute("message", "Đã thêm mã: " + coupon.getCode());
        return "redirect:/admin-coupons";
    }

    /**
     * Xử lý xóa hoặc bật + đặt hạn coupon đã chọn
     */
    @PostMapping
    public String handleActions(
            @RequestParam(name = "selectedCodes", required = false) List<String> codes,
            @RequestParam("_action") String action,
            @RequestParam(name = "scheduledTime", required = false)
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
            LocalDateTime scheduledTime,
            RedirectAttributes ra) {

        if ("delete".equals(action) && codes != null) {
            codes.forEach(code ->
                    couponService.findByCode(code)
                            .ifPresent(c -> couponService.deleteById(c.getId()))
            );
            ra.addFlashAttribute("message", "Đã xóa " + codes.size() + " mã.");
        } else if ("schedule".equals(action) && codes != null && scheduledTime != null) {
            codes.forEach(code ->
                    couponService.findByCode(code).ifPresent(c -> {
                        c.setActive(true);
                        c.setExpiredAt(scheduledTime);
                        couponService.save(c);
                    })
            );
            ra.addFlashAttribute("message",
                    "Đã bật và đặt hạn đến " + scheduledTime + " cho " + codes.size() + " mã.");
        }

        return "redirect:/admin-coupons";
    }
}