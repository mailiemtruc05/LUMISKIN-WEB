package edu.uth.wed_san_pham_cham_soc_da.Controllers;

import edu.uth.wed_san_pham_cham_soc_da.Service.ProductServiceImpl;
import edu.uth.wed_san_pham_cham_soc_da.Service.ShoppingCartService;
import edu.uth.wed_san_pham_cham_soc_da.Service.AccountService;
import edu.uth.wed_san_pham_cham_soc_da.models.Product;
import edu.uth.wed_san_pham_cham_soc_da.models.ShoppingCart;
import edu.uth.wed_san_pham_cham_soc_da.models.Account;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ShoppingcartControllers {

    @Autowired
    private ProductServiceImpl productService;

    @Autowired
    private ShoppingCartService cartService;

    @Autowired
    private AccountService accountService;


    @GetMapping("/shopping-cart")
    public String shoppingCart(Model model,
                               Principal principal,
                               HttpSession session) {
        Account account = accountService.findByUsername(principal.getName());

        model.addAttribute("CARTITEMS", cartService.getCartItems(account));
        double subtotal = cartService.getTotal(account);
        model.addAttribute("TOTAL", subtotal);

        // --- thêm coupon ---
        String couponCode = (String) session.getAttribute("couponCode");
        BigDecimal discount = (BigDecimal) session.getAttribute("couponDiscount");
        if (couponCode != null && discount != null) {
            model.addAttribute("couponCode", couponCode);
            model.addAttribute("discount", discount);
            // tính total sau giảm
            double discountedTotal = subtotal - discount.doubleValue();
            model.addAttribute("discountedTotal", discountedTotal);
        }

        return "shopping-cart";
    }
    @GetMapping("/shopping-cart/remove-coupon")
    public String removeCoupon(HttpSession session,
                               RedirectAttributes ra) {
        session.removeAttribute("couponCode");
        session.removeAttribute("couponDiscount");
        ra.addFlashAttribute("message", "Đã gỡ bỏ mã giảm giá");
        return "redirect:/shopping-cart";
    }

    @GetMapping(value = "/shopping-cart/addAjax/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String, Object> addCartAjax(@PathVariable("id") int id,
                                           Principal principal) {
        // Lấy tài khoản đăng nhập
        Account account = accountService.findByUsername(principal.getName());
        // tim sản phẩm
        Product product = productService.getProductById(id);

        Map<String, Object> resp = new HashMap<>();
        if (product != null) {
            // Thêm vào giỏ
            ShoppingCart item = new ShoppingCart();
            item.setProduct(product);
            item.setProductName(product.getProductName());
            item.setPrice(product.getPrice().longValue());
            item.setQuantity(1);
            cartService.addItem(account, item);

            // tính tổng tiền
            double cartTotal = cartService.getTotal(account);

            resp.put("success", true);
            resp.put("message", "Sản phẩm đã được thêm vào giỏ hàng.");
            resp.put("cartTotal", cartTotal);
        } else {
            resp.put("success", false);
            resp.put("message", "Không tìm thấy sản phẩm.");
        }
        return resp;
    }



    @GetMapping(value = "/shopping-cart/remove/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String,Object> removeItemAjax(@PathVariable int id, Principal principal) {
        // Lấy tài khoản đăng nhập
        Account account = accountService.findByUsername(principal.getName());
        cartService.removeItem(account, id);
        double cartTotal = cartService.getTotal(account);
        return Map.of(
                "productId", id,
                "cartTotal", cartTotal
        );
    }

    @GetMapping(value = "/shopping-cart/increase/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String, Object> increaseItemAjax(@PathVariable("id") int id, Principal principal) {
        Account account = accountService.findByUsername(principal.getName());
        // Tăng 1
        cartService.addItem(account, new ShoppingCart() {{
            setProduct(productService.getProductById(id));
            setQuantity(1);
        }});
        // Lấy thong tin vừa cập nhật
        ShoppingCart item = cartService.getCartItems(account).stream()
                .filter(i -> i.getProduct().getId().equals(id))
                .findFirst().orElseThrow();

        double cartTotal = cartService.getTotal(account);

        Map<String, Object> resp = new HashMap<>();
        resp.put("productId", id);
        resp.put("quantity", item.getQuantity());
        resp.put("lineTotal", item.getTotal());
        resp.put("cartTotal", cartTotal);
        return resp;
    }

    @GetMapping(value = "/shopping-cart/decrease/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String,Object> decreaseItemAjax(@PathVariable int id, Principal principal) {
        Account account = accountService.findByUsername(principal.getName());
        // Giảm 1 (không dưới 1)
        int newQty = cartService.getCartItems(account).stream()
                .filter(i -> i.getProduct().getId().equals(id))
                .findFirst()
                .map(i -> Math.max(i.getQuantity()-1, 1))
                .orElse(1);
        cartService.updateItem(account, id, newQty);

        ShoppingCart item = cartService.getCartItems(account).stream()
                .filter(i -> i.getProduct().getId().equals(id))
                .findFirst().orElseThrow();

        double cartTotal = cartService.getTotal(account);

        return Map.of(
                "productId", id,
                "quantity", item.getQuantity(),
                "lineTotal", item.getTotal(),
                "cartTotal", cartTotal
        );
    }
}