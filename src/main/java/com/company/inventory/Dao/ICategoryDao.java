package com.company.inventory.Dao;

import org.springframework.data.repository.CrudRepository;

import com.company.inventory.model.Category;

public interface ICategoryDao  extends CrudRepository<Category, Long> {
    
}
