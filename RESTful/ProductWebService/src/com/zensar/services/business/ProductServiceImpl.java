package com.zensar.services.business;

import java.util.ArrayList;

/*
 * /*
 * author:Ashi Pal
 * create date:26/7/19
 * modifies date:26/7/19
 * version:1.0
 * copyright:Zensar Technologies
 * Description:it interacts with DAO Layer to get the data from database
 * It encapsulates business logic of application component
 * It also interacts with presentation layer
 * It give data as per business requirement
 */

import java.util.List;

import com.zensar.dao.ProductDao;
import com.zensar.dao.ProductDaoImpl;
import com.zensar.entities.Product;

public class ProductServiceImpl implements ProductService {
	
	private ProductDao dao;
	
	public ProductServiceImpl()
	{
		dao=new ProductDaoImpl();
	}

	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		dao.insert(product);

	}

	@Override
	public void edit(Product product) {
		// TODO Auto-generated method stub
Product dbProduct = findProductById(product.getProductid());
if (dbProduct!=null){
	dbProduct.setName(product.getName());
	dbProduct.setBrand(product.getName());
	dbProduct.setPrice(product.getPrice());
	dao.update(dbProduct);
}
else
{
	System.out.println("product not found");
}
	}

	@Override
	public void remove(Product product) {
		// TODO Auto-generated method stub
		Product dbProduct = findProductById(product.getProductid());
		if (dbProduct!=null)
			dao.delete(dbProduct);
			else
				System.out.println("product not found");
	}

	@Override
	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return dao.getbyId(productId);
	}

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public int getProductCount() {
		// TODO Auto-generated method stub
		return findAllProducts().size();
	}

	@Override
	public List<Product> findProductByBrand(String Brand) {
		// TODO Auto-generated method stub
		List<Product> pList = findAllProducts();
		List<Product> pBList = new ArrayList<>();
		for(Product p:pList){
			if(p.getBrand().equals(Brand)){
				pBList.add(p);
			}
		}
		
		return null;
	}

	@Override
	public List<Product> findProductByPrice(float minPrice, float maxPrice) {
		List<Product> pList = findAllProducts();
		List<Product> pPList = new ArrayList<>();
		for(Product p:pList){
			if(p.getPrice()>=minPrice && p.getPrice()<=maxPrice){
				pPList.add(p);
			}
		}
		return null;
	}

}
