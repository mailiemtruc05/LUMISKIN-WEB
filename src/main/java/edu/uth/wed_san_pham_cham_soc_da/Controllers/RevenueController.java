package edu.uth.wed_san_pham_cham_soc_da.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;              // ← sửa ở đây
import org.springframework.web.bind.annotation.GetMapping;
import edu.uth.wed_san_pham_cham_soc_da.Service.RevenueService;

@Controller
public class RevenueController {
    private final RevenueService revenueService;

    public RevenueController(RevenueService revenueService) {
        this.revenueService = revenueService;
    }

    @GetMapping("/admin/revenue")
    public String showRevenuePage(Model model) {
        model.addAttribute("dailyList",   revenueService.getDailyRevenue());
        model.addAttribute("monthlyList", revenueService.getMonthlyRevenue());
        model.addAttribute("yearlyList",  revenueService.getYearlyRevenue());
        return "revenue";
    }
}
