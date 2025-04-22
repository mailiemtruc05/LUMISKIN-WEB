
package edu.uth.wed_san_pham_cham_soc_da.Controllers;
import edu.uth.wed_san_pham_cham_soc_da.models.Category;
import edu.uth.wed_san_pham_cham_soc_da.models.Product;
import edu.uth.wed_san_pham_cham_soc_da.Service.CategoryServiceImpl;
import edu.uth.wed_san_pham_cham_soc_da.Service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.util.*;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final CategoryServiceImpl categoryService;
    private final ProductServiceImpl productService;

    public HomeController(CategoryServiceImpl categoryService, ProductServiceImpl productService) {
        this.categoryService = categoryService;
        this.productService = productService;
    }

    @GetMapping({"/", "/home"})
    public String home(Model model) {
        // Lấy danh sách danh mục, tránh null nếu không có dữ liệu
        List<Category> categories = Optional.ofNullable(categoryService.getAllCategories())
                .orElse(new ArrayList<>());

        // Lấy danh sách sản phẩm, tránh null nếu không có dữ liệu
        List<Product> products = Optional.ofNullable(productService.getAllProducts())
                .orElse(new ArrayList<>());

        // Nhóm sản phẩm theo danh mục (sử dụng Category ID, tránh lỗi null)
        Map<Integer, List<Product>> productsByCategory = products.stream()
                .filter(p -> p.getCid() != null)
                .collect(Collectors.groupingBy(p -> p.getCid().getId()));

        model.addAttribute("categories", categories);
        model.addAttribute("productsByCategory", productsByCategory);

        // Lấy 10 sản phẩm sale ngẫu nhiên, tránh null nếu không có dữ liệu
        List<Product> saleProducts = Optional.ofNullable(productService.getRandomProducts(10))
                .orElse(new ArrayList<>());
        if (saleProducts.size() > 10) {
            saleProducts = saleProducts.subList(0, 10);
        }
        // Gán mã UUID ngẫu nhiên cho từng sản phẩm sale
        saleProducts.forEach(p -> p.setRandomId(UUID.randomUUID().toString()));
        model.addAttribute("saleProducts", saleProducts);
        model.addAttribute("isSearch", false);
        return "index"; // Trả về trang index.html
    }
}
