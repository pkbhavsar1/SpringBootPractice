package com.employe.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.employe.exception.IncorrectIdException;

@ControllerAdvice
public class EmployeeControllerAdvice extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler({IncorrectIdException.class})
	public ResponseEntity<String> handleIncorrectId(IncorrectIdException incorrectIdException){
		return new ResponseEntity<String>("No Data Exsisted by this Id", HttpStatus.BAD_REQUEST);
	}
}
