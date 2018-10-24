package com.techlab.CustomExceptionApp;

public class StudentNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StudentNotFoundException(String s) {
		super(s);
	}
}
