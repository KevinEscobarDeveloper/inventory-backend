package com.company.inventory.services;

import org.springframework.http.ResponseEntity;

import com.company.inventory.model.Product;
import com.company.inventory.response.ProductResponseRest;

public interface IProductServices {
	
	public ResponseEntity<ProductResponseRest> save(Product product, Long categoryId);
	public ResponseEntity<ProductResponseRest> searchById(Long id); 
	public ResponseEntity<ProductResponseRest> findByName(String name); 
	public ResponseEntity<ProductResponseRest> deleteById(Long id); 
	public ResponseEntity<ProductResponseRest> search();

}
