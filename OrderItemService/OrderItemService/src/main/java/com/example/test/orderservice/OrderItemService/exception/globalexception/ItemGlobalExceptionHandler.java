package com.example.test.orderservice.OrderItemService.exception.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.example.test.orderservice.OrderItemService.exception.ProductNotFoundException;
import com.example.test.orderservice.OrderItemService.exception.ProductNotInsertException;
import com.example.test.orderservice.OrderItemService.exception.ProductsUnavailableException;


@ControllerAdvice
public class ItemGlobalExceptionHandler {
	  @ExceptionHandler({ProductNotInsertException.class})
	    public void exceptionHandler(ProductNotInsertException e) {
	        error(HttpStatus.INTERNAL_SERVER_ERROR,e);
	    } 
	  @ExceptionHandler({ProductNotFoundException.class})
	    public void exceptionHandler(ProductNotFoundException e) {
	        error(HttpStatus.NOT_FOUND,e);
	    }
	  @ExceptionHandler({ProductNotFoundException.class})
	    public void exceptionHandler(ProductsUnavailableException e) {
	        error(HttpStatus.NOT_FOUND,e);
	    }

	private ResponseEntity<Object> error(HttpStatus status, Exception e) {
	        return ResponseEntity.status(status).body(e.getMessage());
	}
}
