package edu.uth.wed_san_pham_cham_soc_da.repository;

import edu.uth.wed_san_pham_cham_soc_da.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
