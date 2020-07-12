package com.example.test.orderservice.OrderItemService.model;

public class Items {
	private String itemName;
	private String itemPrice;
	private int quantity;
	public Items(String itemName, String itemPrice, int quantity) {
		// TODO Auto-generated constructor stub
		this.itemName=itemName;
		this.itemPrice=itemPrice;
		this.quantity=quantity;
		
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	

}
