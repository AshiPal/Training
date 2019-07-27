package com.zensar.dao;

import java.util.List;

import com.zensar.entities.Product;

public interface ProductDao {

	
	void insert(Product product);
	void update(Product product);
	void delete(Product product);
	Product getbyId(int productId);
	List<Product>getAll();
}
