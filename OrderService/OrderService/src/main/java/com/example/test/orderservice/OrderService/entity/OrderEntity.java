package com.example.test.orderservice.OrderService.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity(name="ORDER")
public class OrderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ORDER_ID")
	private int orderId;	
	@Column(name="ORDER_NAME")	
	private String orderName;	
	@Column(name="TOTAL_AMOUNT")	
	private Double totalAmount;	
	@Column(name="ADDRESS")
	private String address;
	@Column(name="ORDER_DATE")
	private Date oderDate;
	@OneToMany
	@JoinTable(joinColumns=@JoinColumn(name="ORDER_ID"),inverseJoinColumns = @JoinColumn(name="ITEM_ORDER_ID"))
    private List<OrderItemEntity> orderItemEntity;

	public Date getOderDate() {
		return oderDate;
	}

	public void setOderDate(Date oderDate) {
		this.oderDate = oderDate;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<OrderItemEntity> getOrderItemEntity() {
		return orderItemEntity;
	}

	public void setOrderItemEntity(List<OrderItemEntity> orderItemEntity) {
		this.orderItemEntity = orderItemEntity;
	}

	
	
	
	
	
	
	
	
}
