package com.example.test.orderservice.OrderService.service;

import org.springframework.stereotype.Service;

import com.example.test.orderservice.OrderService.exceptions.OrderCreationException;
import com.example.test.orderservice.OrderService.exceptions.OrderNotFoundException;
import com.example.test.orderservice.OrderService.model.Order;
public interface OrderService {

	public int saveOrder(Order order)throws OrderCreationException;

	public Order getOrderById(int id) throws OrderNotFoundException;
	
	
}
