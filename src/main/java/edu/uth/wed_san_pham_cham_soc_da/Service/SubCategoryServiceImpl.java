package edu.uth.wed_san_pham_cham_soc_da.Service;

import edu.uth.wed_san_pham_cham_soc_da.models.SubCategory;
import edu.uth.wed_san_pham_cham_soc_da.repository.SubCategoryRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {
    private final SubCategoryRepository subCategoryRepository;

    public SubCategoryServiceImpl(SubCategoryRepository subCategoryRepository) {
        this.subCategoryRepository = subCategoryRepository;
    }

    @Cacheable(value = "subCategory", key = "#id")
    public SubCategory findById(Integer id) {
        return subCategoryRepository.findById(id).orElse(null);
    }

    @Cacheable("subCategories")
    public List<SubCategory> getAllSubCategories() {
        return subCategoryRepository.findAll();
    }
}
