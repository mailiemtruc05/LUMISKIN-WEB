package edu.uth.wed_san_pham_cham_soc_da.repository;

import edu.uth.wed_san_pham_cham_soc_da.models.Category;
import edu.uth.wed_san_pham_cham_soc_da.models.Product;
import edu.uth.wed_san_pham_cham_soc_da.models.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    // Lọc sản phẩm theo Category
    List<Product> findAllByCid(Category cid);

    // Lọc sản phẩm theo SubCategory
    List<Product> findAllBySubCategory(SubCategory subCategory);

    @Query(value = "SELECT * FROM product ORDER BY NEWID() OFFSET 0 ROWS FETCH NEXT :limit ROWS ONLY", nativeQuery = true)
    List<Product> findRandomProducts(@Param("limit") int limit);

    // Phương thức tìm kiếm sản phẩm theo productName
    @Query("SELECT p FROM Product p WHERE lower(p.productName) LIKE lower(concat('%', :search, '%'))")
    List<Product> searchProducts(@Param("search") String search);
}
