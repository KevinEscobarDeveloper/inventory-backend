package com.company.inventory.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.company.inventory.model.Product;

public interface IProductDao extends CrudRepository<Product, Long>{
	
	List <Product> findByNameContainingIgnoreCase(String name);
	
}
