package com.example.practice.post.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(PostCreationException.class)
	public ResponseEntity<String> handlePostCreationException(PostCreationException e) {
		log.error("PostCreationException: {}", e.getMessage());
		return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException e) {
		log.error("IllegalArgumentException: {}", e.getMessage());
		return ResponseEntity
				.status(HttpStatus.BAD_REQUEST.value())
				.body(e.getMessage());
	}
	
	

}
