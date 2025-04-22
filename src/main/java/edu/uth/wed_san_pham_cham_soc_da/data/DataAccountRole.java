package edu.uth.wed_san_pham_cham_soc_da.data;

import org.springframework.core.annotation.Order;
import edu.uth.wed_san_pham_cham_soc_da.models.*;
import edu.uth.wed_san_pham_cham_soc_da.repository.*;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class DataAccountRole {

    @Bean
    @Order(3) // ✅ Đảm bảo chạy sau DataRole (@Order 2)
    ApplicationRunner initAccountRoleData(AccountRoleRepository accountRoleRepo,
                                          AccountRepository accountRepo,
                                          RoleRepository roleRepo) {
        return args -> {
            if (accountRoleRepo.count() > 0) {
                System.out.println("ℹ️ Bảng account_role đã có dữ liệu, bỏ qua việc insert.");
                return;
            }

            // 🔍 Tạo danh sách ID để thêm vào
            List<int[]> data = Arrays.asList(
                    new int[]{1, 1},
                    new int[]{2, 1},
                    new int[]{3, 1},
                    new int[]{4, 1}
            );

            // ✅ Duyệt qua danh sách và thêm dữ liệu vào database
            for (int[] entry : data) {
                int accountId = entry[0];
                int roleId = entry[1];

                Account account = accountRepo.findById(accountId).orElse(null);
                Roles role = roleRepo.findById(roleId).orElse(null);

                if (account != null && role != null) {
                    AccountRole accountRole = new AccountRole(account, role);
                    accountRoleRepo.save(accountRole);
                    System.out.println("✅ Thêm: Account " + accountId + " -> Role " + roleId);
                } else {
                    System.out.println("❌ Lỗi: Không tìm thấy Account ID " + accountId + " hoặc Role ID " + roleId);
                }
            }
        };
    }
}
