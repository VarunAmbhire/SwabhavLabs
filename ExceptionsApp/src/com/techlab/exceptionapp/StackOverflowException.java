package com.techlab.exceptionapp;

public class StackOverflowException {
	int number = 1;

	public void exceptionMethos() {
		System.out.println("Exception " + number);
		number++;
		exceptionMethos();

	}
}
