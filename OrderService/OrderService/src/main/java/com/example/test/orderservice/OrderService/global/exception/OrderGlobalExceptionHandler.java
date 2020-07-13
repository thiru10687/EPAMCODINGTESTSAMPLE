package com.example.test.orderservice.OrderService.global.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.test.orderservice.OrderService.exceptions.InsufficientItemsIntheSystem;
import com.example.test.orderservice.OrderService.exceptions.OrderCreationException;
import com.example.test.orderservice.OrderService.exceptions.OrderNotFoundException;


@ControllerAdvice
public class OrderGlobalExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<Object> exceptionHandler(OrderNotFoundException ex){
		
		return new ResponseEntity<Object>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<Object> exceptionHandler(OrderCreationException ex){
		
		return new ResponseEntity<Object>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler
	public ResponseEntity<Object> exceptionHandler(InsufficientItemsIntheSystem ex){
		
		return new ResponseEntity<Object>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
