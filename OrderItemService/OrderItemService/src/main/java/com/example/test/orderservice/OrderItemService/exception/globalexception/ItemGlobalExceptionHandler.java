package com.example.test.orderservice.OrderItemService.exception.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//import com.example.test.orderservice.OrderService.exceptions.ProductNotFoundException;

@ControllerAdvice
public class ItemGlobalExceptionHandler {
	/*
	 * @ExceptionHandler public ResponseEntity<Object>
	 * exceptionHandler(OrderNotFoundException ex){
	 * 
	 * return new ResponseEntity<Object>(ex.getMessage(),HttpStatus.NOT_FOUND); }
	 */
}
