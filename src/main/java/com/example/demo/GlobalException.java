package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(PricenotFoundException.class)
	public ResponseEntity<Object> idHandling(){
		return new  ResponseEntity<>("sory",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(BrandNotException.class)
	public ResponseEntity<Object> isHandling(){
		return new  ResponseEntity<>("brand",HttpStatus.BAD_REQUEST);
	}


}
