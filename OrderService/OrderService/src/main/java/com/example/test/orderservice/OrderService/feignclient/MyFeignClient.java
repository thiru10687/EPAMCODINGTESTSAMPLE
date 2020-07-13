package com.example.test.orderservice.OrderService.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.test.orderservice.OrderService.model.Order;
import com.example.test.orderservice.OrderService.model.OrderItems;
import com.example.test.orderservice.OrderService.model.Product;

@FeignClient(value = "${feign.service}",url="${feign.serviceurl}")
public interface MyFeignClient {	
@GetMapping("/get/product/{name}")
public  Product getProductItemsByName(@PathVariable String name);

}
