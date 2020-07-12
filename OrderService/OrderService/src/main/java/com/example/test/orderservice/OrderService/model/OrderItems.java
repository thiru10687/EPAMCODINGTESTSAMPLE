package com.example.test.orderservice.OrderService.model;

public class OrderItems {
	private String itemName;
	private Double itemPrice;
	private int quantity;
	private int orderId;
	private int itemId;
	public OrderItems() {
				
	}
	public OrderItems(String itemName, Double itemPrice, int quantity,int orderId,int itemId) {
		// TODO Auto-generated constructor stub
		this.itemName=itemName;
		this.itemPrice=itemPrice;
		this.quantity=quantity;
		this.orderId=orderId;	
		this.itemId=itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	

}
