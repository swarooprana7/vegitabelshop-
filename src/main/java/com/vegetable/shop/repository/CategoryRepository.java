package com.vegetable.shop.repository;

import com.vegetable.shop.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByCategoryName(String name);
}
