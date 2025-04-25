package edu.uth.wed_san_pham_cham_soc_da.Controllers;

import edu.uth.wed_san_pham_cham_soc_da.models.Product;
import edu.uth.wed_san_pham_cham_soc_da.Service.ProductServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class ProductdetailsControllers {
    private final ProductServiceImpl productService;

    public ProductdetailsControllers(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping("/product-details/{id}")
    public String productDetails(@PathVariable Integer id, Model model) {
        Product product = productService.getProductById(id);
        if (product == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sản phẩm không tồn tại");
        }

        // Xử lý xuống dòng thành <br/>
        String formattedDescription = product.getDescription().replace("\n", "<br/>");

        model.addAttribute("product", product);
        model.addAttribute("formattedDescription", formattedDescription); // Truyền biến đã xử lý

        return "product-details";
    }
}
