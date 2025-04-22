package edu.uth.wed_san_pham_cham_soc_da.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {
    @RequestMapping("/about")
    public String about() {
        return "about"; // Điều hướng đến templates/about.html
    }
}
