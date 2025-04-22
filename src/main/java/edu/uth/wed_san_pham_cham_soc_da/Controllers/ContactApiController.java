package edu.uth.wed_san_pham_cham_soc_da.Controllers;

import edu.uth.wed_san_pham_cham_soc_da.models.Account;
import edu.uth.wed_san_pham_cham_soc_da.models.Contact;
import edu.uth.wed_san_pham_cham_soc_da.models.ContactDto;
import edu.uth.wed_san_pham_cham_soc_da.Service.ContactService;
import edu.uth.wed_san_pham_cham_soc_da.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Map;

@RestController
@RequestMapping("/api/contact")
public class ContactApiController {

    private final ContactService contactService;
    private final AccountService accountService;

    @Autowired
    public ContactApiController(ContactService contactService, AccountService accountService) {
        this.contactService = contactService;
        this.accountService = accountService;
    }

    @PostMapping("/send")
    public ResponseEntity<?> createContact(@RequestBody ContactDto contactDto, Principal principal) {
        // Lấy username của người dùng đang đăng nhập từ Principal
        String username = principal.getName();
        Account account = accountService.findByUsername(username);
        if (account == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    Map.of("status", "error", "message", "Không tìm thấy Account với username: " + username)
            );
        }

        Contact contact = new Contact();
        // Giả sử trong entity Contact bạn đổi tên thuộc tính thành "account" thay vì "userID"
        contact.setUserID(account);
        contact.setEmail(contactDto.getEmail());
        contact.setTenKhachHang(contactDto.getTenKhachHang());
        contact.setTenSanPham(contactDto.getTenSanPham());
        contact.setNoiDung(contactDto.getNoiDung());

        contactService.saveContact(contact);

        return ResponseEntity.ok(
                Map.of("status", "success", "message", "Liên hệ đã được gửi thành công.")
        );
    }
    @GetMapping("/chitiet")
    public ResponseEntity<?> getAllContacts() {
        return ResponseEntity.ok(contactService.getAllContacts());
    }

}
