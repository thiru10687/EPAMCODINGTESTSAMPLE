package com.example.test.orderservice.OrderItemService.dao.impl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.test.orderservice.OrderItemService.dao.OrderItemServiceDao;
import com.example.test.orderservice.OrderItemService.entity.ProductEntity;
import com.example.test.orderservice.OrderItemService.exception.ProductNotFoundException;
import com.example.test.orderservice.OrderItemService.exception.ProductNotInsertException;
import com.example.test.orderservice.OrderItemService.exception.ProductsUnavailableException;
import com.example.test.orderservice.OrderItemService.model.Product;

@Repository
public class OrderServiceDaoImpl implements OrderItemServiceDao{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public int saveProduct(Product product) throws ProductNotInsertException {

		ProductEntity prodEntity = new ProductEntity();
		prodEntity.setProductId(product.getProductCode());
		prodEntity.setProductName(product.getProductName());
		prodEntity.setProductQuantity(product.getProductQuantity());
		Session session = sessionFactory.getCurrentSession();
		int prodId = (int) session.save(prodEntity);
		return prodId;
		
	}

	@Override
	public List<Product> getAllProducts() throws ProductsUnavailableException {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("SELECT  FROM Product p", Product.class).getResultList();  
	}

	@Override
	public Product getbyProdId(int id) throws ProductNotFoundException {
		Session session = sessionFactory.getCurrentSession();		
		Product product = new Product();		
		ProductEntity productEntity = session.get(ProductEntity.class, id);		
		product.setProductCode(productEntity.getProductId());
		product.setProductName(productEntity.getProductName());
		product.setProductQuantity(productEntity.getProductQuantity());
		return product;
	}

	@Override
	public Product getProductItemsByName(String name) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();		
		Product product = new Product();
		ProductEntity productEntity = session.get(ProductEntity.class, name);		
		product.setProductCode(productEntity.getProductId());
		product.setProductName(productEntity.getProductName());
		product.setProductQuantity(productEntity.getProductQuantity());
		return product;
	}
		
}
