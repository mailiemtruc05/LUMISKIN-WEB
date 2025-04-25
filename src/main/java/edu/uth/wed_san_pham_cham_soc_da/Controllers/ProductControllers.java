
package edu.uth.wed_san_pham_cham_soc_da.Controllers;
import edu.uth.wed_san_pham_cham_soc_da.models.Category;
import edu.uth.wed_san_pham_cham_soc_da.models.Product;
import edu.uth.wed_san_pham_cham_soc_da.models.SubCategory;
import edu.uth.wed_san_pham_cham_soc_da.Service.CategoryServiceImpl;
import edu.uth.wed_san_pham_cham_soc_da.Service.ProductServiceImpl;
import edu.uth.wed_san_pham_cham_soc_da.Service.SubCategoryServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

@Controller
public class ProductControllers {

    private final ProductServiceImpl productService;
    private final CategoryServiceImpl categoryService;
    private final SubCategoryServiceImpl subCategoryService;

    public ProductControllers(ProductServiceImpl productService,
                              CategoryServiceImpl categoryService,
                              SubCategoryServiceImpl subCategoryService) {
        this.productService = productService;
        this.categoryService = categoryService;
        this.subCategoryService = subCategoryService;
    }

    /**
     * Xử lý yêu cầu GET tại URL "/product" với các tham số tùy chọn: cat (category id) và sub (subcategory id).
     */
    @GetMapping("/product")
    public String listProducts(
            @RequestParam(value = "cat", required = false) Integer catId,
            @RequestParam(value = "sub", required = false) Integer subId,
            Model model) {

        // Lấy danh sách tất cả các danh mục
        List<Category> categories = categoryService.getAllCategories();

        // Khởi tạo danh sách sản phẩm rỗng
        List<Product> products = new ArrayList<>();

        // Sử dụng AtomicReference để lưu activeCat vì cần thay đổi bên trong lambda
        AtomicReference<Integer> activeCatRef = new AtomicReference<>(
                (categories.isEmpty()) ? null : categories.get(0).getId()
        );

        // Nếu có chỉ định subCategory
        if (subId != null) {
            Optional<SubCategory> subCategoryOpt = Optional.ofNullable(subCategoryService.findById(subId));
            subCategoryOpt.ifPresent(subCategory -> {
                products.addAll(productService.findBySubCategory(subCategory));
                if (subCategory.getCategory() != null) {
                    activeCatRef.set(subCategory.getCategory().getId());
                }
            });
        }
        // Nếu không có subCategory nhưng có category
        else if (catId != null) {
            Optional<Category> categoryOpt = Optional.ofNullable(categoryService.findById(catId));
            categoryOpt.ifPresent(category -> {
                products.addAll(productService.findByCategory(category));
                activeCatRef.set(category.getId());
            });
        }
        // Nếu không chỉ định cả subId và catId thì lấy tất cả sản phẩm
        else {
            products.addAll(productService.getAllProducts());
        }

        // Lấy giá trị active category id từ AtomicReference
        Integer activeCat = activeCatRef.get();

        // Gom nhóm sản phẩm theo category id (chỉ những sản phẩm có category khác null)
        Map<Integer, List<Product>> productsByCategory = products.stream()
                .filter(p -> p.getCid() != null)
                .collect(Collectors.groupingBy(p -> p.getCid().getId()));

        // Xác định đối tượng activeCategory dựa trên activeCat
        Category activeCategory = categories.stream()
                .filter(c -> c.getId().equals(activeCat))
                .findFirst()
                .orElse(null);

        // Đưa các dữ liệu cần thiết vào model để view có thể sử dụng
        model.addAttribute("categories", categories);
        model.addAttribute("productsByCategory", productsByCategory);
        model.addAttribute("activeCat", activeCat);
        model.addAttribute("activeCategory", activeCategory);
        model.addAttribute("selectedCatId", catId);
        model.addAttribute("selectedSubId", subId);
        model.addAttribute("isSearch", false);

        // --- Xử lý phần "Sản phẩm liên quan" ---
        // Lấy danh sách sản phẩm liên quan, nếu không có trả về danh sách trống
        List<Product> relatedProducts = Optional.ofNullable(productService.getRandomProducts(10))
                .orElse(new ArrayList<>());
        // Gán mã UUID ngẫu nhiên cho từng sản phẩm liên quan
        relatedProducts.forEach(p -> p.setRandomId(UUID.randomUUID().toString()));

        model.addAttribute("relatedProducts", relatedProducts);
        // Trả về view "product"
        return "product";
    }

    /**
     * Xử lý tìm kiếm sản phẩm theo tên.
     * Khi người dùng nhập từ khóa tìm kiếm, trang sẽ hiển thị kết quả tìm kiếm và ẩn các tab danh mục.
     */
    @GetMapping("/search")
    public String searchProducts(@RequestParam("query") String query, Model model) {
        List<Product> searchResults = productService.searchProducts(query);
        model.addAttribute("searchResults", searchResults);
        model.addAttribute("isSearch", true);
        return "product";
    }
}
