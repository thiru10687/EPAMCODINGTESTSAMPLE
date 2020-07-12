package com.example.test.orderservice.OrderService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Generated;

import net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy;

@Entity(name="ORDER_ITEMS")
public class OrderItemEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ITEM_ID")
	private int itemId;
	@Column(name="ITEM_NAME")
	private String itemName;
	@Column(name="ITEM_PRICE")
	private double itemPrice;
	
	@Column(name="ITEM_QUNTITY")
	private int  itemQuantity;
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
	
}
