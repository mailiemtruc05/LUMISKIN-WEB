package edu.uth.wed_san_pham_cham_soc_da.data;

import org.springframework.core.annotation.Order;
import edu.uth.wed_san_pham_cham_soc_da.models.Roles;
import edu.uth.wed_san_pham_cham_soc_da.repository.RoleRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataRole {

    @Bean
    @Order(2) // ✅ Đặt đúng thứ tự
    ApplicationRunner initData(RoleRepository roleRepo) {
        return args -> {
            if (roleRepo.count() > 0) {
                System.out.println("ℹ️ Bảng roles đã có dữ liệu, bỏ qua việc insert.");
                return;
            }

            Roles roleAdmin = new Roles("ADMIN");
            Roles roleKhach = new Roles("KHACH");

            roleRepo.save(roleAdmin);
            roleRepo.save(roleKhach);

            System.out.println("✅ Dữ liệu roles đã được thêm vào thành công!");
        };
    }
}
