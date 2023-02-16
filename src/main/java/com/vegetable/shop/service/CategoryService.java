package com.vegetable.shop.service;

import com.vegetable.shop.Entities.Category;

import java.util.List;


public interface CategoryService {

    void save(Category category);
    List<Category> findAll();
}
