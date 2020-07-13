package com.example.test.orderservice.OrderItemService.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.orderservice.OrderItemService.dao.OrderItemServiceDao;
import com.example.test.orderservice.OrderItemService.exception.ProductNotFoundException;
import com.example.test.orderservice.OrderItemService.exception.ProductNotInsertException;
import com.example.test.orderservice.OrderItemService.exception.ProductsUnavailableException;
import com.example.test.orderservice.OrderItemService.model.Product;
import com.example.test.orderservice.OrderItemService.service.OrderItemService;

@Service
public class OrderItemServiceImpl implements OrderItemService{

 @Autowired
 OrderItemServiceDao orderItemServiceDao;
	
	@Override
	public int saveProduct(Product product) throws ProductNotInsertException {
		// TODO Auto-generated method stub
		return orderItemServiceDao.saveProduct(product);
	}

	@Override
	public List<Product> getAllProducts() throws ProductsUnavailableException {
		// TODO Auto-generated method stub
		return orderItemServiceDao.getAllProducts();
	}

	@Override
	public Product getbyProdId(int id) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		 return orderItemServiceDao.getbyProdId(id);
	}

	@Override
	public Product getProductItemsByName(String name) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		 return orderItemServiceDao.getProductItemsByName(name);
	}

}
