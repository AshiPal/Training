package com.zensar.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.zensar.entities.Product;

/*
 * author:Ashi Pal
 * create date:26/7/19
 * modifies date:26/7/19
 * version:1.0
 * copyright:Zensar Technologies
 * Description:data access abject interface implements
 * It is product implementation class of hibernate
 * value object of product
 */
public class ProductDaoImpl implements ProductDao {
	
	private Session session;
	
		public ProductDaoImpl()
		{
			Configuration cfg=new Configuration().configure();
			SessionFactory factory=cfg.buildSessionFactory();
			session=factory.openSession();
			System.out.println("connection established");
			
		}

	@Override
	public void insert(Product product) {
		// TODO Auto-generated method stub'
		Transaction tx=session.beginTransaction();
		session.save(product);
		tx.commit();
		System.out.println("product inserted");

	}

	@Override
	public void update(Product product) {
		Transaction tx=session.beginTransaction();
		session.update(product);
		tx.commit();
		System.out.println("product updated");

	}

	@Override
	public void delete(Product product) {
		Transaction tx=session.beginTransaction();
		session.delete(product);
		tx.commit();
		System.out.println("product deleted");

	}

	@Override
	public Product getbyId(int productId) {
		// TODO Auto-generated method stub
		return session.get(Product.class, productId);
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		Query query = session.createQuery("from Product");
		
		return query.getResultList();
	}

}
