package edu.uth.wed_san_pham_cham_soc_da.Service;

import edu.uth.wed_san_pham_cham_soc_da.models.Coupon;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Service interface cho các thao tác với entity Coupon.
 */
public interface CouponService {
    List<Coupon> findAll();
    Optional<Coupon> findByCode(String code);
    Coupon save(Coupon coupon);
    void deleteById(Long id);

    /**
     * Lấy danh sách coupon đã active và chưa hết hạn
     * (dùng cho trang người dùng)
     * @param now thời điểm hiện tại
     */
    List<Coupon> findAvailable(LocalDateTime now);
}