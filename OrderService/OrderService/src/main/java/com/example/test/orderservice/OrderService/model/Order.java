package com.example.test.orderservice.OrderService.model;

import java.util.Date;
import java.util.List;

public class Order {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	private String name;
	
	public  Order() {
		
	}
	
	public Order(String name, Date orderDate, List<OrderItems> ordertems, String address, Double totalAmount) {
		super();
		this.name = name;
		this.orderDate = orderDate;
		this.ordertems = ordertems;
		this.address = address;
		this.totalAmount = totalAmount;
	}

	private Date orderDate;
	
	private List<OrderItems>ordertems;
	
	private String address;
	
	private Double totalAmount;
	


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<OrderItems> getOrdertems() {
		return ordertems;
	}

	public void setOrdertems(List<OrderItems> ordertems) {
		this.ordertems = ordertems;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
}
