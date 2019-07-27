package com.zensar.services.business;

import java.util.List;

import com.zensar.entities.Product;

/*
 * author:Ashi Pal
 * create date:26/7/19
 * modifies date:26/7/19
 * version:1.0
 * copyright:Zensar Technologies
 * Description:business object interface
 * if focus of business logic interface
 */

public interface ProductService {
	void create(Product product);
	void edit(Product product);
	void remove(Product product);
	Product findProductById(int productId);
	List<Product> findAllProducts();
	int getProductCount();
	List<Product> findProductByBrand(String Brand);
	List<Product> findProductByPrice(float minPrice,float maxPrice);
	
}

