package edu.uth.wed_san_pham_cham_soc_da.data;

import org.springframework.core.annotation.Order;
import edu.uth.wed_san_pham_cham_soc_da.models.Account;
import edu.uth.wed_san_pham_cham_soc_da.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class DataAccount implements CommandLineRunner {
    private final AccountRepository accountRepository;

    public DataAccount(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void run(String... args) {
        System.out.println("🚀 Running CommandLineRunner...");

        if (accountRepository.count() == 0) {
            accountRepository.save(new Account("truc", "$2a$10$lwJ3RUlg8yNuyH7sqPKwbOa13JM8XFY6GWFtMI1vHCfH76Z6VkJK6", "admin@example.com", "0123456789"));
            accountRepository.save(new Account("dat", "$2a$10$lwJ3RUlg8yNuyH7sqPKwbOa13JM8XFY6GWFtMI1vHCfH76Z6VkJK6", "admin2@example.com", "0987654321"));
            accountRepository.save(new Account("quang", "$2a$10$lwJ3RUlg8yNuyH7sqPKwbOa13JM8XFY6GWFtMI1vHCfH76Z6VkJK6", "admin3@example.com", "0933333433"));
            accountRepository.save(new Account("dai", "$2a$10$lwJ3RUlg8yNuyH7sqPKwbOa13JM8XFY6GWFtMI1vHCfH76Z6VkJK6", "admin4@example.com", "0933353333"));
            accountRepository.save(new Account("tin", "$2a$10$lwJ3RUlg8yNuyH7sqPKwbOa13JM8XFY6GWFtMI1vHCfH76Z6VkJK6", "admin5@example.com", "0933633333"));

            accountRepository.save(new Account("khach1", "$2a$10$zoIcAJbpZMYkYiR/lH90wOTUxzw.pGKJev7TskNwoRYCuvJp1ZWK6", "khach1@example.com", "0123886789"));
            accountRepository.save(new Account("khach2", "$2a$10$zoIcAJbpZMYkYiR/lH90wOTUxzw.pGKJev7TskNwoRYCuvJp1ZWK6", "khach2@example.com", "0999654321"));

            System.out.println("✅ Dữ liệu đã được chèn vào bảng Account.");
        } else {
            System.out.println("⚠️ Dữ liệu Account đã tồn tại, không cần chèn thêm.");
        }
    }
}
