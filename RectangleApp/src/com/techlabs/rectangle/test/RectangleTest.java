package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();

		rectangle.setHeight(-2);
		rectangle.setWidth(300);
		rectangle.setColor("blue");

		System.out.println("Height= " + rectangle.getHeight() + "  Width= " + rectangle.getWidth());
		System.out.println("Area of Rectangle= " + rectangle.calculateArea());
		System.out.println("Color of Rectangle= " + rectangle.getColor());
	}
}
