package edu.uth.wed_san_pham_cham_soc_da.Controllers;

import edu.uth.wed_san_pham_cham_soc_da.Service.CategoryServiceImpl;
import edu.uth.wed_san_pham_cham_soc_da.models.Category;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;

import java.util.List;

@ControllerAdvice
public class GlobalControllerAdvice {
    private final CategoryServiceImpl categoryService;

    public GlobalControllerAdvice(CategoryServiceImpl categoryService) {
        this.categoryService = categoryService;
    }

    @ModelAttribute
    public void addCategoriesToModel(Model model) {
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categories", categories);
    }
}


