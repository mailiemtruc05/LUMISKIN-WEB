package edu.uth.wed_san_pham_cham_soc_da.Service;

import edu.uth.wed_san_pham_cham_soc_da.models.Coupon;
import edu.uth.wed_san_pham_cham_soc_da.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Triển khai các phương thức trong CouponService.
 */
@Service
public class CouponServiceImpl implements CouponService {
    @Autowired
    private CouponRepository couponRepository;

    @Override
    public List<Coupon> findAll() {
        return couponRepository.findAll();
    }

    @Override
    public Optional<Coupon> findByCode(String code) {
        return couponRepository.findByCode(code);
    }

    @Override
    public Coupon save(Coupon coupon) {
        return couponRepository.save(coupon);
    }

    @Override
    public void deleteById(Long id) {
        couponRepository.deleteById(id);
    }

    @Override
    public List<Coupon> findAvailable(LocalDateTime now) {
        return couponRepository.findByActiveTrueAndExpiredAtAfter(now);
    }
}