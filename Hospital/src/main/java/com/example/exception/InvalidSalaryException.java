package com.example.exception;

public class InvalidSalaryException extends Exception{

	public InvalidSalaryException() {
		super();

	}

	public InvalidSalaryException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public InvalidSalaryException(String message, Throwable cause) {
		super(message, cause);
	
	}

	public InvalidSalaryException(String message) {
		super(message);
		
	}

	public InvalidSalaryException(Throwable cause) {
		super(cause);

	}

	
	
}
