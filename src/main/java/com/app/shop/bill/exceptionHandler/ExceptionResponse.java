package com.app.shop.bill.exceptionHandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.app.shop.bill.exception.BillNotFoundException;

@ControllerAdvice
@RestController
public class ExceptionResponse extends ResponseEntityExceptionHandler {

	@ExceptionHandler(BillNotFoundException.class)
	public ResponseEntity<Object> handleBillNotFoundException(BillNotFoundException exception, WebRequest request){
		ExceptionMessageFormat response=new ExceptionMessageFormat
				(exception.getMessage(), new Date().toGMTString(), request.getDescription(true));
		return new ResponseEntity<>(response,HttpStatus.FORBIDDEN);
	}
}
