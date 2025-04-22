package edu.uth.wed_san_pham_cham_soc_da.Service;

import edu.uth.wed_san_pham_cham_soc_da.models.ShoppingCart;
import edu.uth.wed_san_pham_cham_soc_da.models.Account;
import edu.uth.wed_san_pham_cham_soc_da.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    private ShoppingCartRepository cartRepo; //tu dong lay ra lop ket noi csld de dụng trong
    //de dung trong cac ham them, xoa, sua, lay trong du lieu gio hang
    @Override
    public List<ShoppingCart> getCartItems(Account account) {
        return cartRepo.findByAccount(account);
    }
    //lay danh sach san pham trong gio hang cua tai khoan dang dang nhap
    @Override
    @Transactional
    public void addItem(Account account, ShoppingCart item) {
        // Lấy giỏ hàng hiện tại của tài khoản gan vao currentItems
        List<ShoppingCart> currentItems = cartRepo.findByAccount(account);
        Optional<ShoppingCart> existingItemOpt = currentItems.stream()
                .filter(i -> i.getProduct().getId().equals(item.getProduct().getId()))
                .findFirst();
        if (existingItemOpt.isPresent()) {
            ShoppingCart existingItem = existingItemOpt.get();
            existingItem.setQuantity(existingItem.getQuantity() + item.getQuantity());
            cartRepo.save(existingItem);
        } else {
            item.setAccount(account);
            cartRepo.save(item);
        }
    }

    @Override
    @Transactional
    public void removeItem(Account account, int productId) {
        List<ShoppingCart> currentItems = cartRepo.findByAccount(account);
        currentItems.stream()
                .filter(item -> item.getProduct().getId().equals(productId))
                .findFirst()
                .ifPresent(cartRepo::delete);
    }

    @Override
    @Transactional
    public void updateItem(Account account, int productId, int newQuantity) {
        List<ShoppingCart> currentItems = cartRepo.findByAccount(account);
        currentItems.stream()
                .filter(item -> item.getProduct().getId().equals(productId))
                .findFirst()
                .ifPresent(item -> {
                    item.setQuantity(newQuantity);
                    cartRepo.save(item);
                });
    }

    @Override
    public double getTotal(Account account) {
        return cartRepo.findByAccount(account)
                .stream()
                .mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();
    }
}