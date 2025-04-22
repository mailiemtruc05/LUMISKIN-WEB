package edu.uth.wed_san_pham_cham_soc_da.Controllers;

import edu.uth.wed_san_pham_cham_soc_da.Service.AccountService;
import edu.uth.wed_san_pham_cham_soc_da.models.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    AccountService accountService;
    @GetMapping("/accounts")
    public List<Account> getAccounts() {
        return accountService.findAllAccounts();
    }

    @PostMapping
    public ResponseEntity<?> registerAccount(@RequestBody Account account) {
        try{
            accountService.registerAccount(account); // Lưu vào database
            return ResponseEntity.ok("Đăng ký thành công!");
        } catch (RuntimeException e) {

            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
}
