package edu.uth.wed_san_pham_cham_soc_da.Controllers;

import edu.uth.wed_san_pham_cham_soc_da.Service.AccountService;
import edu.uth.wed_san_pham_cham_soc_da.models.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/account")
class AccountRestController {
    @Autowired
    AccountService accountService;

    @GetMapping("/accounts")
    public List<Account> getAccounts() {
        return accountService.findAllAccounts();
    }

    @PostMapping
    public ResponseEntity<?> registerAccount(@RequestBody Account account) {
        try {
            accountService.registerAccount(account);
            return ResponseEntity.ok("Đăng ký thành công!");
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}

// ---------- Giao diện Web cho thông tin tài khoản (Controller thường) ----------
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Hiển thị thông tin tài khoản
    @GetMapping
    public String viewAccount(Model model, Principal principal) {
        String username = principal.getName();
        Account account = accountService.findByUsername(username);
        model.addAttribute("account", account);
        return "account_info";
    }

    // Cập nhật email và số điện thoại
    @PostMapping("/update")
    public String updateAccount(@ModelAttribute("account") Account updatedAccount,
                                Principal principal,
                                RedirectAttributes redirectAttributes) {
        String username = principal.getName();
        Account existingAccount = accountService.findByUsername(username);

        existingAccount.setEmail(updatedAccount.getEmail());
        existingAccount.setPhone(updatedAccount.getPhone());

        accountService.updateAccount(existingAccount);
        redirectAttributes.addFlashAttribute("message", "Cập nhật thông tin thành công!");
        return "redirect:/account";
    }

    // Đổi mật khẩu
    @PostMapping("/change-password")
    public String changePassword(@RequestParam("currentPassword") String currentPassword,
                                 @RequestParam("newPassword") String newPassword,
                                 @RequestParam("confirmPassword") String confirmPassword,
                                 Principal principal,
                                 RedirectAttributes redirectAttributes) {

        String username = principal.getName();
        Account account = accountService.findByUsername(username);

        // Kiểm tra mật khẩu hiện tại có đúng không
        if (!passwordEncoder.matches(currentPassword, account.getPassword())) {
            redirectAttributes.addFlashAttribute("passwordMessage", "Mật khẩu hiện tại không đúng!");
            return "redirect:/account";
        }

        // Kiểm tra mật khẩu mới có giống mật khẩu hiện tại không
        if (passwordEncoder.matches(newPassword, account.getPassword())) {
            redirectAttributes.addFlashAttribute("passwordMessage", "Mật khẩu mới không được giống mật khẩu hiện tại!");
            return "redirect:/account";
        }

        // Kiểm tra mật khẩu mới và nhập lại mật khẩu mới có giống nhau không
        if (!newPassword.equals(confirmPassword)) {
            redirectAttributes.addFlashAttribute("passwordMessage", "Mật khẩu mới không khớp!");
            return "redirect:/account";
        }

        // Cập nhật mật khẩu mới
        account.setPassword(passwordEncoder.encode(newPassword));
        accountService.updateAccount(account);
        redirectAttributes.addFlashAttribute("passwordMessageTC", "Đổi mật khẩu thành công!");
        return "redirect:/account";
    }
}
