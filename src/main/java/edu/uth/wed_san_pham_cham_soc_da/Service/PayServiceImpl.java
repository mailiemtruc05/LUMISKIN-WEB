package edu.uth.wed_san_pham_cham_soc_da.Service;

import edu.uth.wed_san_pham_cham_soc_da.models.*;
import edu.uth.wed_san_pham_cham_soc_da.repository.PayRepository;
import edu.uth.wed_san_pham_cham_soc_da.repository.ShoppingCartRepository;
import edu.uth.wed_san_pham_cham_soc_da.repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PayServiceImpl implements PayService {

    @Autowired
    private PayRepository payRepository;

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Override
    public Pay processPayment(Account account, Pay payForm, List<ShoppingCart> cartItems) {
        // Tạo đơn hàng (Pay)
        Pay newOrder = new Pay();
        newOrder.setUserID(account);
        newOrder.setTenKhachHang(payForm.getTenKhachHang());
        newOrder.setSoDienThoai(payForm.getSoDienThoai());
        newOrder.setEmail(payForm.getEmail());
        newOrder.setPttt(payForm.getPttt());
        newOrder.setDiaChi(payForm.getDiaChi());
        newOrder.setNgaySinh(payForm.getNgaySinh());

        // Tính tổng tiền
        long tongTien = cartItems.stream()
                .mapToLong(item -> item.getPrice() * item.getQuantity())
                .sum();
        newOrder.setGiaTien(tongTien);

        // Lưu đơn hàng trước để có ID
        payRepository.save(newOrder);

        // Lưu chi tiết đơn hàng
        List<OrderDetail> orderDetails = new ArrayList<>();
        for (ShoppingCart item : cartItems) {
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setPay(newOrder);
            orderDetail.setTenSanPham(item.getProduct().getProductName());
            orderDetail.setSoLuong(item.getQuantity());
            orderDetail.setDonGia(item.getPrice());
            orderDetail.setThanhTien(item.getPrice() * item.getQuantity());

            // Lưu OrderDetail và thêm vào danh sách
            orderDetailRepository.save(orderDetail);
            orderDetails.add(orderDetail);
        }

        // Gán danh sách chi tiết đơn hàng cho Pay
        newOrder.setOrderDetails(orderDetails);

        // Cập nhật đơn hàng sau khi có orderDetails
        payRepository.save(newOrder);

        // Xoá giỏ hàng
        shoppingCartRepository.deleteAll(cartItems);

        // Trả về đơn hàng đã được xử lý và lưu
        return newOrder;
    }
}
