package com.techlab.reflectionapp;

import java.awt.print.Printable;

public class ReflectionTest {

	public static void main(String[] args) throws Exception {
		Class className =Number.class;

		ReflectionClass reflectionClass = new ReflectionClass(className);
		System.out.println("Number of Methods in class      : " + reflectionClass.methodCounter());
		System.out.println("Number of Constructors in class : " + reflectionClass.constructorCounter());
		System.out.println("Number of Getters in class      : " + reflectionClass.getterCounter());
		System.out.println("Number of Setters in class      : " + reflectionClass.setterCounter());
	}
}
