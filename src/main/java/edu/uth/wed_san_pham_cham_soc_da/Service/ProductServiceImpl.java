
package edu.uth.wed_san_pham_cham_soc_da.Service;
import edu.uth.wed_san_pham_cham_soc_da.models.Category;
import edu.uth.wed_san_pham_cham_soc_da.models.Product;
import edu.uth.wed_san_pham_cham_soc_da.models.ProductDTO;
import edu.uth.wed_san_pham_cham_soc_da.models.SubCategory;
import edu.uth.wed_san_pham_cham_soc_da.repository.ProductRepository;
import edu.uth.wed_san_pham_cham_soc_da.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @Cacheable("products")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getRandomProducts(int limit) {
        return productRepository.findRandomProducts(limit);
    }

    @Cacheable(value = "product", key = "#id")
    public Product getProductById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    @Cacheable(value = "productsByCategory", key = "#category?.id ?: '0'")
    public List<Product> findByCategory(Category category) {
        return productRepository.findAllByCid(category);
    }

    @Cacheable(value = "productsBySubCategory", key = "#subCategory?.id ?: '0'")
    public List<Product> findBySubCategory(SubCategory subCategory) {
        return productRepository.findAllBySubCategory(subCategory);
    }

    // Xóa toàn bộ cache khi có thay đổi dữ liệu (bao gồm cả cache của tìm kiếm)
    @CacheEvict(value = {"products", "product", "productsByCategory", "productsBySubCategory", "searchProducts"}, allEntries = true)
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @CacheEvict(value = {"products", "product", "productsByCategory", "productsBySubCategory", "searchProducts"}, allEntries = true)
    @Transactional
    public void deleteProduct(Integer id) {

        shoppingCartRepository.deleteByProductId(id);

        productRepository.deleteById(id);

    }

    @CacheEvict(value = {"products", "product", "productsByCategory", "productsBySubCategory", "searchProducts"}, allEntries = true)
    public Product updateProduct(Integer id,Product productDetails) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy sản phẩm"));
        product.setProductName(productDetails.getProductName());
        product.setDescription(productDetails.getDescription());
        product.setImage(productDetails.getImage());
        product.setPrice(productDetails.getPrice());
        return productRepository.save(product);
    }
    public List<ProductDTO> getAllProductDTOs() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(product -> {
            ProductDTO dto = new ProductDTO();
            dto.setId(product.getId());
            dto.setProductName(product.getProductName());
            dto.setImage(product.getImage());
            dto.setPrice(product.getPrice());
            dto.setDescription(product.getDescription());
            dto.setCategoryId(product.getCid().getId());
            dto.setSubCategoryId(product.getSubCategory().getId());
            return dto;
        }).collect(Collectors.toList());

    }

    // Phương thức tìm kiếm sản phẩm theo productName
    @Cacheable("searchProducts")
    public List<Product> searchProducts(String search) {
        return productRepository.searchProducts(search);
    }
}
