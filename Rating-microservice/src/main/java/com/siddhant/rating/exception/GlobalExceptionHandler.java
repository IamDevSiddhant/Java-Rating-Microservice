package com.siddhant.rating.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(RatingException.class)
	
	public ResponseEntity<Map<String, Object>> exceptionhandler(RatingException ratingException){
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("message", ratingException.getMessage());
		map.put("Success", false);
		map.put("StatusCode", HttpStatus.NOT_FOUND);
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		
		
	}

}
