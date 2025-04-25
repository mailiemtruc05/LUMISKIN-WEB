package edu.uth.wed_san_pham_cham_soc_da.data;

import org.springframework.core.annotation.Order;
import edu.uth.wed_san_pham_cham_soc_da.models.Category;
import edu.uth.wed_san_pham_cham_soc_da.repository.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Order(4)
@Component
public class DaTaCategory implements CommandLineRunner {
    private final CategoryRepository categoryRepository;

    public DaTaCategory(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) {
        if (categoryRepository.count() == 0) { // Kiểm tra xem bảng có dữ liệu chưa
            categoryRepository.save(new Category("Chăm sóc da mặt"));
            categoryRepository.save(new Category("Nâng niu làn da"));
            categoryRepository.save(new Category("Sản phẩm khác"));
            System.out.println("✅ Dữ liệu mẫu đã được chèn vào bảng Category.");
        } else {
            System.out.println("⚠️ Dữ liệu Category đã tồn tại, không cần chèn thêm.");
        }
    }
}