package edu.uth.wed_san_pham_cham_soc_da.repository;

import edu.uth.wed_san_pham_cham_soc_da.models.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Repository quản lý thao tác CRUD trên entity Coupon.
 * Bao gồm method custom để lấy coupon đã active và chưa hết hạn.
 */
@Repository
public interface CouponRepository extends JpaRepository<Coupon, Long> {
    /**
     * Tìm coupon bởi code duy nhất
     */
    Optional<Coupon> findByCode(String code);

    /**
     * Lấy danh sách coupon đã active và chưa hết hạn (expiredAt > now)
     * Dùng cho hiển thị trang người dùng
     */
    List<Coupon> findByActiveTrueAndExpiredAtAfter(LocalDateTime now);
}