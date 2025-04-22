package edu.uth.wed_san_pham_cham_soc_da.Service;

import edu.uth.wed_san_pham_cham_soc_da.models.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category findById(Integer id);
}
