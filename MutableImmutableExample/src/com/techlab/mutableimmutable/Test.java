package com.techlab.mutableimmutable;

public class Test {

	public static void main(String[] args) {
		MutableStudent mutableStudent = new MutableStudent(10, "Name");
		ImmutableStudent immutableStudent=new ImmutableStudent(12, "asas");

		
		mutableStudent.setName("qwerty");

		
		System.out.println(immutableStudent.getName());
		System.out.println(mutableStudent.getName());
		
	}

}
