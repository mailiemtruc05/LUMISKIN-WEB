package edu.uth.wed_san_pham_cham_soc_da.repository;

import edu.uth.wed_san_pham_cham_soc_da.models.ShoppingCart;
import edu.uth.wed_san_pham_cham_soc_da.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {
    List<ShoppingCart> findByAccount(Account account);
    void deleteByProductId(Integer id);
}