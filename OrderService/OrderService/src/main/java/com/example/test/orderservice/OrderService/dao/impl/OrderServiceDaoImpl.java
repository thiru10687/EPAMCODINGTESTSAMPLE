package com.example.test.orderservice.OrderService.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.test.orderservice.OrderService.dao.OrderServiceDao;
import com.example.test.orderservice.OrderService.entity.OrderEntity;
import com.example.test.orderservice.OrderService.entity.OrderItemEntity;
import com.example.test.orderservice.OrderService.exceptions.OrderCreationException;
import com.example.test.orderservice.OrderService.exceptions.OrderNotFoundException;
import com.example.test.orderservice.OrderService.model.Order;
import com.example.test.orderservice.OrderService.model.OrderItems;

@Repository
public class OrderServiceDaoImpl implements OrderServiceDao{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public int saveOrder(Order order)throws OrderCreationException {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		OrderEntity orderEntity = new  OrderEntity();
		orderEntity.setOrderName(order.getName());
		orderEntity.setAddress(order.getAddress());
		orderEntity.setTotalAmount(order.getTotalAmount());
		orderEntity.setOderDate(new Date());		
		List<OrderItems> itemsList = order.getOrdertems();	
		List<OrderItemEntity> OrderItemEntityList = new ArrayList<OrderItemEntity>();
		for(OrderItems item:itemsList) {
			OrderItemEntity orderItemEntity= new OrderItemEntity();
			orderItemEntity.setItemName(item.getItemName());
			orderItemEntity.setItemPrice(item.getItemPrice());
			OrderItemEntityList.add(orderItemEntity);
		}
        orderEntity.setOrderItemEntity(OrderItemEntityList);
		return (int) session.save(orderEntity);
	}
	@Override
	public Order getOrderById(int id) throws OrderNotFoundException {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();		
		OrderEntity orderEntity= session.get(OrderEntity.class, id);		
		Order order = new Order();		
		order.setAddress(orderEntity.getAddress());
		order.setName(orderEntity.getOrderName());
		order.setOrderDate(orderEntity.getOderDate());
		order.setTotalAmount(orderEntity.getTotalAmount());
		List<OrderItems> orderItems = new ArrayList<OrderItems>();
		List<OrderItemEntity> orderItemList = orderEntity.getOrderItemEntity();
		for(OrderItemEntity orderItemEntity:orderItemList) {
			OrderItems orderItem = new OrderItems();
			orderItem.setItemName(orderItemEntity.getItemName());
			orderItem.setItemPrice(orderItemEntity.getItemPrice());
			orderItem.setQuantity(orderItemEntity.getItemQuantity());
			orderItem.setItemId(orderItemEntity.getItemId());
			orderItems.add(orderItem);
		}
		
		order.setOrdertems(orderItems);
		
		return order;
		
	}
;
	
}
