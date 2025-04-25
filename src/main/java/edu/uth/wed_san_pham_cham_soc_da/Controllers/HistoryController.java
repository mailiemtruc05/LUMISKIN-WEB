package edu.uth.wed_san_pham_cham_soc_da.Controllers;

import edu.uth.wed_san_pham_cham_soc_da.models.Account;
import edu.uth.wed_san_pham_cham_soc_da.models.Pay;
import edu.uth.wed_san_pham_cham_soc_da.Service.AccountServiceiml;
import edu.uth.wed_san_pham_cham_soc_da.repository.PayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.security.Principal;
import java.util.List;

@Controller
public class HistoryController {

    @Autowired
    private AccountServiceiml accountService;

    @Autowired
    private PayRepository payRepository;

    @GetMapping("/history")
    public String showOrderHistory(Model model, Principal principal) {
        if (principal == null) {
            return "redirect:/login";
        }

        String username = principal.getName();
        Account account = accountService.findByUsername(username);

        if (account == null) {
            return "redirect:/login";
        }

        List<Pay> orders = payRepository.findByUserID(account);
        model.addAttribute("orders", orders);
        return "orderHistory";
    }

    @GetMapping("/order-detail/{id}")
    public String viewOrderDetail(@PathVariable("id") Long id, Model model, Principal principal) {
        if (principal == null) {
            return "redirect:/login";
        }

        Pay order = payRepository.findById(id).orElse(null);


        if (order == null || !order.getUserID().getUsername().equals(principal.getName())) {
            return "redirect:/history";
        }

        model.addAttribute("order", order);
        model.addAttribute("orderDetails", order.getOrderDetails());
        return "orderDetail";
    }
}
