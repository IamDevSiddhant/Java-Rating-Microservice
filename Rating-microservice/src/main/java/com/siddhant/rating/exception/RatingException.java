package com.siddhant.rating.exception;

public class RatingException extends RuntimeException {

	public RatingException() {
		super("No Rating Found");
	}
	
	public RatingException(String message) {
		super(message);
	}
	
	
}
