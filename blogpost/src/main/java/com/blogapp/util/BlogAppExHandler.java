package com.blogapp.util;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.blogapp.dto.ErrorDetails;
import com.blogapp.exceptions.ResouceNotFoundException;

@RestControllerAdvice
public class BlogAppExHandler {
	
	//throws advice of AOP
	@ExceptionHandler(ResouceNotFoundException.class)
	public ResponseEntity<ErrorDetails> handle404(Exception ex) {
		ErrorDetails details = new ErrorDetails();
		details.setTimestemp(LocalDateTime.now());
		details.setDetails(ex.getMessage());
		details.setStatusCode(HttpStatus.NOT_FOUND.toString());
		details.setName("rgupta.mtech@gmail.com");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(details);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handle400(MethodArgumentNotValidException ex) {
		
		Map<String, String> errorMap = new HashMap<>();
		
		ex.getBindingResult().getFieldErrors().forEach( e-> errorMap.put(e.getField(), e.getDefaultMessage()));
	
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMap);
	}
	
	
//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<ErrorDetails> handle500(Exception ex) {
//		ErrorDetails details = new ErrorDetails();
//		details.setTimestemp(LocalDateTime.now());
//		details.setDetails("pls try after sometime");
//		details.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.toString());
//		details.setName("rgupta.mtech@gmail.com");
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(details);
//	}
	

}
