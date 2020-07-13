package com.example.test.orderservice.OrderItemService.dao;

import java.util.List;

import com.example.test.orderservice.OrderItemService.exception.ProductNotFoundException;
import com.example.test.orderservice.OrderItemService.exception.ProductNotInsertException;
import com.example.test.orderservice.OrderItemService.exception.ProductsUnavailableException;
import com.example.test.orderservice.OrderItemService.model.Product;

public interface OrderItemServiceDao {

	int saveProduct(Product product)throws ProductNotInsertException;

	List<Product> getAllProducts() throws ProductsUnavailableException;

	Product getbyProdId(int id) throws ProductNotFoundException;

	Product getProductItemsByName(String name)throws ProductNotFoundException;

}
