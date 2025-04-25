package edu.uth.wed_san_pham_cham_soc_da;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
@SpringBootApplication
@EnableCaching  // Kích hoạt caching trong Spring Boot
@EnableScheduling
public class WedSanPhamChamSocDaApplication {
    public static void main(String[] args) {
        SpringApplication.run(WedSanPhamChamSocDaApplication.class, args);
    }
}
