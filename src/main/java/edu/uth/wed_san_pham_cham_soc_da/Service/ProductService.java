package edu.uth.wed_san_pham_cham_soc_da.Service;

import edu.uth.wed_san_pham_cham_soc_da.models.Category;
import edu.uth.wed_san_pham_cham_soc_da.models.Product;
import edu.uth.wed_san_pham_cham_soc_da.models.ProductDTO;
import edu.uth.wed_san_pham_cham_soc_da.models.SubCategory;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    List<Product> getRandomProducts(int limit);

    Product getProductById(Integer id);

    List<Product> findByCategory(Category category);

    List<Product> findBySubCategory(SubCategory subCategory);

    Product addProduct(Product product);

    void deleteProduct(Integer id);

    Product updateProduct(Integer id, Product productDetails);

    List<ProductDTO> getAllProductDTOs();

    List<Product> searchProducts(String search);
}
