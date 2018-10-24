package com.techlab.exceptionapp;

public class ExceptionTest {

	public static void main(String[] args) {


	}
	
	public void exceptioClassCast() {
		Object object = new String();
		Integer integers = (Integer) object;
	}
	
	public void exceptionumberFormat() {
		String string = "marine";
		int number = Integer.parseInt(string);
	}

}
