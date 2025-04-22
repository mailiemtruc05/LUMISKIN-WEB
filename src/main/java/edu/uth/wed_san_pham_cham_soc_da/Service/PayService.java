package edu.uth.wed_san_pham_cham_soc_da.Service;

import edu.uth.wed_san_pham_cham_soc_da.models.Account;
import edu.uth.wed_san_pham_cham_soc_da.models.Pay;
import edu.uth.wed_san_pham_cham_soc_da.models.ShoppingCart;

import java.util.List;

public interface PayService {
    Pay processPayment(Account account, Pay payForm, List<ShoppingCart> cartItems);
}
