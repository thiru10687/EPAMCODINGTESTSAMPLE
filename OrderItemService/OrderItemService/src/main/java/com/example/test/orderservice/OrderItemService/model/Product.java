package com.example.test.orderservice.OrderItemService.model;

public class Product {
	
private int productCode;
private String productName;
private int productQuantity;

public Product(int productCode, String productName, int productQuantity) {
	super();
	this.productCode = productCode;
	this.productName = productName;
	this.productQuantity = productQuantity;
}

public int getProductCode() {
	return productCode;
}
public void setProductCode(int productCode) {
	this.productCode = productCode;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getProductQuantity() {
	return productQuantity;
}
public void setProductQuantity(int productQuantity) {
	this.productQuantity = productQuantity;
}

}
