package edu.uth.wed_san_pham_cham_soc_da.Service;

import edu.uth.wed_san_pham_cham_soc_da.models.ShoppingCart;
import edu.uth.wed_san_pham_cham_soc_da.models.Account;
import java.util.List;

public interface ShoppingCartService {
    List<ShoppingCart> getCartItems(Account account);
    void addItem(Account account, ShoppingCart item);
    void removeItem(Account account, int productId);
    void updateItem(Account account, int productId, int newQuantity);
    double getTotal(Account account);
}