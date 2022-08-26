package com.tareq23.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public String exceptionHandling(Exception ex)
	{
		return "error";
	}

}
