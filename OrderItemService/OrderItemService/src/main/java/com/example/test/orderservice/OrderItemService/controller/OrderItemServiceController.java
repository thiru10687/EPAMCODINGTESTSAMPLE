package com.example.test.orderservice.OrderItemService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.test.orderservice.OrderItemService.exception.ProductNotFoundException;
import com.example.test.orderservice.OrderItemService.exception.ProductNotInsertException;
import com.example.test.orderservice.OrderItemService.exception.ProductsUnavailableException;
import com.example.test.orderservice.OrderItemService.model.Product;
import com.example.test.orderservice.OrderItemService.service.OrderItemService;

@RestController
@RequestMapping("/products")
public class OrderItemServiceController {
	
@Autowired
OrderItemService orderItemService;

@RequestMapping("/add/product")
	public ResponseEntity<String> addProducts(@ModelAttribute("product") Product product)throws ProductNotInsertException{
		int prodId = 0;
		try {
			prodId = orderItemService.saveProduct(product);
		} 		
		catch (ProductNotInsertException ex) {
			 throw new ProductNotInsertException("System is down , Please try Later");
		}		
		return new ResponseEntity<String>("Product Successfully added in the System with id " + prodId, HttpStatus.OK);
	}

@RequestMapping("/get/all/products")
public ResponseEntity<List<Product>> getAllProducts()throws ProductsUnavailableException{		
	List<Product> products = orderItemService.getAllProducts();	
	if(null !=products && products.size()>=1) {
	return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}else {
		throw new ProductsUnavailableException("No Products available in the system");
	}
	
}
@RequestMapping("/get/product/{id}")
public ResponseEntity<Product> getbyProdId(@PathVariable int id)throws ProductNotFoundException{		
	Product product = orderItemService.getbyProdId(id);	
	if(null != product ) {
	return new ResponseEntity<Product>(product, HttpStatus.OK);
	}else {
		throw new ProductNotFoundException("Product not found in the system"+id);
	}
	
}

@RequestMapping("/get/product/{name}")
public ResponseEntity<Product> getProductItemsByName(@PathVariable String name)throws ProductNotFoundException{		
	Product product = orderItemService.getProductItemsByName(name.toLowerCase());	
	if(null != product ) {
	return new ResponseEntity<Product>(product, HttpStatus.OK);
	}else {
		throw new ProductNotFoundException("Product not found in the system by Name :"+name);
	}
	
}

}
