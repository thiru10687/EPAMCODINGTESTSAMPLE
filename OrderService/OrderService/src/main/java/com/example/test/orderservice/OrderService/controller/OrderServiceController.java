package com.example.test.orderservice.OrderService.controller;

import java.util.Date;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.orderservice.OrderService.exceptions.ItemsNotFoundException;
import com.example.test.orderservice.OrderService.exceptions.OrderCreationException;
import com.example.test.orderservice.OrderService.exceptions.OrderNotFoundException;
import com.example.test.orderservice.OrderService.feignclient.MyFeignClient;
import com.example.test.orderservice.OrderService.model.Order;
import com.example.test.orderservice.OrderService.model.OrderItems;
import com.example.test.orderservice.OrderService.service.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderServiceController {	
	@Autowired
	MyFeignClient myFeignClient;
	@Autowired
	private OrderService orderService;

	@RequestMapping("/get/{order-id}")
	public ResponseEntity<Order> getOrderById(@PathVariable("order-id") int id) throws OrderNotFoundException { 
		Order order = orderService.getOrderById(id);
		if (null != order) {
			return new ResponseEntity<Order>(order, HttpStatus.OK);
		} else {
			throw new OrderNotFoundException(" Order details not found with order id:  " + id);
		}
	}
	
  @RequestMapping("/create")
   public ResponseEntity<String> createOrder(@ModelAttribute("order") Order order)throws OrderCreationException,ItemsNotFoundException{ 	 
	   List<OrderItems> items =  order.getOrdertems();
	  if(null != items && items.size()>=1) {
		  Double totalAmount = items.stream().map(x -> x.getItemPrice()).collect(Collectors.summingDouble(Double::doubleValue));
		  order.setTotalAmount(totalAmount);	
		  order.setOrderDate(new Date());
	  }	 else {
		  throw new ItemsNotFoundException("Items not added to the order,Please add your wish items to order");
	  }	  
	  int id = orderService.saveOrder(order);
	  
	 return  new ResponseEntity<String>("Thank you for choosing us, Your order has successfully careated and order is "+id,HttpStatus.OK);
	
	  
	  
	  
	  
}	
 
  
}
