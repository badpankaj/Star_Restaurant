package com.xyz.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler1 {
	@ExceptionHandler(value=DrDetailsNotFoundException.class)
	public ResponseEntity<?>handlerDrDetailsNotFound(DrDetailsNotFoundException e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
}
