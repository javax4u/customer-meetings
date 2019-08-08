package com.javax4u.exception;


public class CustomGlobalExceptionHandler extends RuntimeException{
	public CustomGlobalExceptionHandler(Long id) {
		super("Book id not found: "+id);
	}
}
