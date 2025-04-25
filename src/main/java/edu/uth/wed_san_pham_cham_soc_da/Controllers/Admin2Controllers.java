package edu.uth.wed_san_pham_cham_soc_da.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Admin2Controllers {
    @RequestMapping("/admin2")
    public String Admin2() {
        return "admin2"; // Điều hướng đến templates/about.html
    }
}
