package edu.uth.wed_san_pham_cham_soc_da.Service;

import edu.uth.wed_san_pham_cham_soc_da.models.SubCategory;

import java.util.List;

public interface SubCategoryService {
    SubCategory findById(Integer id);
    List<SubCategory> getAllSubCategories();
}
