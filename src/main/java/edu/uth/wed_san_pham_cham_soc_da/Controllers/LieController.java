package edu.uth.wed_san_pham_cham_soc_da.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class LieController {
    @RequestMapping("/lie")
    public String contact() {
        return "lie"; // Điều hướng đến templates/contact.html
    }
}
