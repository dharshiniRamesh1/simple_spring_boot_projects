package com.studentproject.demo1.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.studentproject.demo1.entity.*;
@ControllerAdvice
@ResponseStatus
public class EntityExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(StudentNotFounfException.class)
	public ResponseEntity<ErrorMessege> 
	studentNotFounfException(StudentNotFounfException exception,WebRequest ){
	  ErrorMessage message = 
			  new ErrorMessage(HttpStatus.NOT_FOUND,exception.getMessage());
	  
	  return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
}
  
}
