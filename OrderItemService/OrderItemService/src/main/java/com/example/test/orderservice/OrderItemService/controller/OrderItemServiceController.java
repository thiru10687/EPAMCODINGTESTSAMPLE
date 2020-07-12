package com.example.test.orderservice.OrderItemService.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.orderservice.OrderItemService.model.Items;
import com.example.test.orderservice.OrderItemService.model.Product;

@RestController
@RequestMapping("/products")
public class OrderItemServiceController {
@RequestMapping("/add/product")
	public ResponseEntity<Product> addProducts(@ModelAttribute("product") Product product){
		
		System.out.println("Product Details"+product.getProductCode());
		System.out.println("Product Details"+product.getProductCode());
		System.out.println("Product Details"+product.getProductCode());
		
		return new ResponseEntity<Product>(product,HttpStatus.OK);

	}

@RequestMapping("/get/all/products")
public String getAllProducts(@PathVariable  int  id){	
	System.out.println("It is calling , Wow wonderfull thiru"+id);
	return "sucessfull called";

}
}
