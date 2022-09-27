package com.HDAP.Entities.ExceptionsHandling;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<List<ErrorModel>> handleBusinessException(BusinessException bex) {
		System.out.println("BusinessException is Thrown ");
		return new ResponseEntity<List<ErrorModel>>(bex.getErrorlist(),HttpStatus.BAD_REQUEST);
	}
}
