package edu.uth.wed_san_pham_cham_soc_da.data;

import edu.uth.wed_san_pham_cham_soc_da.models.Coupon;
import edu.uth.wed_san_pham_cham_soc_da.Service.CouponService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Order(1)
@Component
public class DataCoupon implements CommandLineRunner {
    private final CouponService couponService;

    public DataCoupon(CouponService couponService) {
        this.couponService = couponService;
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i <= 3; i++) {
            String code = "CPN" + String.format("%03d", i);
            BigDecimal amount = BigDecimal.valueOf(10000 * i); // e.g., 10k, 20k, ... 100k
            LocalDateTime expires = LocalDateTime.now().plusDays(30);
            if (couponService.findByCode(code).isEmpty()) {
                Coupon c = new Coupon(code, amount, expires);
                couponService.save(c);
            }
        }
    }
}