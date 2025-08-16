package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void CreateCategory(Category category);
     String deleteCategory(long categoryId);

    Category updateCategory(Category category, long categoryId);
}
