package edu.uth.wed_san_pham_cham_soc_da.Service;

import edu.uth.wed_san_pham_cham_soc_da.models.Account;
import edu.uth.wed_san_pham_cham_soc_da.models.Pay;
import edu.uth.wed_san_pham_cham_soc_da.models.OrderDetail;
import edu.uth.wed_san_pham_cham_soc_da.models.ShoppingCart;
import edu.uth.wed_san_pham_cham_soc_da.repository.PayRepository;
import edu.uth.wed_san_pham_cham_soc_da.repository.ShoppingCartRepository;
import edu.uth.wed_san_pham_cham_soc_da.repository.OrderDetailRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PayServiceImpl implements PayService {

    @Autowired
    private PayRepository payRepository;

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    /**
     * Xử lý thanh toán, lưu đơn hàng và chi tiết, xóa giỏ hàng.
     * @param account    tài khoản người mua
     * @param payForm    thông tin khách hàng trên form
     * @param cartItems  danh sách món trong giỏ
     * @param discount   số tiền giảm (có thể null)
     * @return Pay       đối tượng đơn hàng đã lưu với tổng tiền cuối cùng
     */
    @Override
    public Pay processPayment(Account account,
                              Pay payForm,
                              List<ShoppingCart> cartItems,
                              BigDecimal discount) {

        // Tạo đơn hàng cơ bản
        Pay newOrder = new Pay();
        newOrder.setUserID(account);
        newOrder.setTenKhachHang(payForm.getTenKhachHang());
        newOrder.setSoDienThoai(payForm.getSoDienThoai());
        newOrder.setEmail(payForm.getEmail());
        newOrder.setPttt(payForm.getPttt());
        newOrder.setDiaChi(payForm.getDiaChi());
        newOrder.setNgaySinh(payForm.getNgaySinh());

        // Tính tổng gốc
        long total = cartItems.stream()
                .mapToLong(item -> item.getPrice() * item.getQuantity())
                .sum();

        // Áp dụng giảm giá nếu có
        long finalTotal = total;
        if (discount != null) {
            finalTotal = total - discount.longValue();
        }
        newOrder.setGiaTien(finalTotal);

        // Lưu đơn hàng để có ID
        payRepository.save(newOrder);

        // Lưu chi tiết đơn hàng
        List<OrderDetail> orderDetails = new ArrayList<>();
        for (ShoppingCart item : cartItems) {
            OrderDetail od = new OrderDetail();
            od.setPay(newOrder);
            od.setTenSanPham(item.getProduct().getProductName());
            od.setSoLuong(item.getQuantity());
            od.setDonGia(item.getPrice());
            od.setThanhTien(item.getPrice() * item.getQuantity());

            orderDetailRepository.save(od);
            orderDetails.add(od);
        }
        newOrder.setOrderDetails(orderDetails);

        // Cập nhật đơn hàng với chi tiết
        payRepository.save(newOrder);

        return newOrder;
    }

    @Override
    public Optional<Pay> findByMaDH(Long maDH) {
        return payRepository.findByMaDH(maDH);
    }

    @Override
    @Transactional
    public void cancelOrder(Long maDH) {
        Optional<Pay> optionalPay = payRepository.findByMaDH(maDH);
        if (optionalPay.isPresent()) {
            Pay pay = optionalPay.get();
            List<OrderDetail> details = pay.getOrderDetails();
            if (details != null && !details.isEmpty()) {
                orderDetailRepository.deleteAll(details);  // Xóa chi tiết
            }
            payRepository.delete(pay);  // Sau đó mới xóa đơn hàng
        }
    }

}