package edu.uth.wed_san_pham_cham_soc_da.data;

import org.springframework.core.annotation.Order;
import edu.uth.wed_san_pham_cham_soc_da.models.Category;
import edu.uth.wed_san_pham_cham_soc_da.models.SubCategory;
import edu.uth.wed_san_pham_cham_soc_da.repository.CategoryRepository;
import edu.uth.wed_san_pham_cham_soc_da.repository.SubCategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Order(5)
@Component
public class DataSubCategory implements CommandLineRunner {
    private final CategoryRepository categoryRepository;
    private final SubCategoryRepository subCategoryRepository;

    public DataSubCategory(CategoryRepository categoryRepository, SubCategoryRepository subCategoryRepository) {
        this.categoryRepository = categoryRepository;
        this.subCategoryRepository = subCategoryRepository;
    }

    @Override
    public void run(String... args) {
        System.out.println("🚀 Running CommandLineRunner...");

        // Tìm Category
        Optional<Category> skincareOpt = categoryRepository.findById(1);
        Optional<Category> bodycareOpt = categoryRepository.findById(2);
        Optional<Category> otherproductsOpt = categoryRepository.findById(3);

        if (skincareOpt.isPresent() && bodycareOpt.isPresent()) {
            Category skincare = skincareOpt.get();
            Category bodycare = bodycareOpt.get();
            Category otherproducts = otherproductsOpt.get();

            // Kiểm tra xem SubCategory đã tồn tại chưa
            if (subCategoryRepository.count() == 0) {
                subCategoryRepository.save(new SubCategory("Sữa rửa mặt", skincare));
                subCategoryRepository.save(new SubCategory("Serum", skincare));
                subCategoryRepository.save(new SubCategory("Kem dưỡng ẩm", skincare));
                subCategoryRepository.save(new SubCategory("Kem chống nắng", skincare));

                subCategoryRepository.save(new SubCategory("Sữa tắm dưỡng ẩm", bodycare));
                subCategoryRepository.save(new SubCategory("Tẩy tế bào chết body", bodycare));
                subCategoryRepository.save(new SubCategory("Tinh dầu thư giãn", bodycare));
                subCategoryRepository.save(new SubCategory("Dưỡng thể trắng da", bodycare));

                subCategoryRepository.save(new SubCategory("Mặt nạ", otherproducts));
                subCategoryRepository.save(new SubCategory("Tẩy trang", otherproducts));
                subCategoryRepository.save(new SubCategory("Dụng cụ chăm sóc da", otherproducts));
                subCategoryRepository.save(new SubCategory("Thực phẩm chức năng", otherproducts));


                System.out.println("✅ Dữ liệu đã được chèn vào bảng SubCategory.");
            } else {
                System.out.println("⚠️ Dữ liệu SubCategory đã tồn tại, không cần chèn thêm.");
            }
        } else {
            System.out.println("❌ Không tìm thấy Category phù hợp, không thể thêm SubCategory.");
        }
    }
}
