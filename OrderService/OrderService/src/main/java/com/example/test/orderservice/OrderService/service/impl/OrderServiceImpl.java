package com.example.test.orderservice.OrderService.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.orderservice.OrderService.dao.OrderServiceDao;
import com.example.test.orderservice.OrderService.exceptions.OrderCreationException;
import com.example.test.orderservice.OrderService.exceptions.OrderNotFoundException;
import com.example.test.orderservice.OrderService.model.Order;
import com.example.test.orderservice.OrderService.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderServiceDao  orderServiceDao;
	@Override
	public int saveOrder(Order order)throws OrderCreationException {
		// TODO Auto-generated method stub
		return orderServiceDao.saveOrder(order);
		
	}
	@Override
	public Order getOrderById(int id) throws OrderNotFoundException {
		// TODO Auto-generated method stub
		return orderServiceDao.getOrderById(id);
	}

}
