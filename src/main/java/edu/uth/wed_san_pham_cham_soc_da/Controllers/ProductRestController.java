package edu.uth.wed_san_pham_cham_soc_da.Controllers;

import edu.uth.wed_san_pham_cham_soc_da.Service.ProductServiceImpl;
import edu.uth.wed_san_pham_cham_soc_da.models.Product;
import edu.uth.wed_san_pham_cham_soc_da.models.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductRestController {
    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("/products")
    public List<ProductDTO> getAllProducts() {
        return productService.getAllProductDTOs();
    }

    @PostMapping
    public ResponseEntity<?> addProduct(@RequestBody Product product) {
        try{

            productService.addProduct(product); // Lưu vào database
            return ResponseEntity.ok("Thêm thành công!");
        } catch (RuntimeException e) {

            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }


}
