package com.example.test.orderservice.OrderService.dao;

import com.example.test.orderservice.OrderService.exceptions.OrderCreationException;
import com.example.test.orderservice.OrderService.exceptions.OrderNotFoundException;
import com.example.test.orderservice.OrderService.model.Order;

public interface OrderServiceDao {

	int saveOrder(Order order) throws OrderCreationException;

	Order getOrderById(int id) throws OrderNotFoundException;

}
