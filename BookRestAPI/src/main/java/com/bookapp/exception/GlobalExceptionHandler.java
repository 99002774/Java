package com.bookapp.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	public GlobalExceptionHandler() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
