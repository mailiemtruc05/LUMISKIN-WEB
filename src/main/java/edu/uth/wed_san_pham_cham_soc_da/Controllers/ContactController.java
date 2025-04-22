package edu.uth.wed_san_pham_cham_soc_da.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact")
public class ContactController {

    // GET /contact
    @GetMapping("")
    public String contact() {
        return "contact";
    }

    // GET /contact/chitiet
    @GetMapping("/chitiet")
    public String contactChiTietPage() {
        // Nếu file template nằm ở src/main/resources/templates/master/contactchitiet.html
        // thì trả về "master/contactchitiet"
        return "contactchitiet";
    }
}
