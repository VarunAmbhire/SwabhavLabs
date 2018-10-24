package com.techlabs.circle.test;

import com.techlabs.circleapp.BorderStyle;
import com.techlabs.circleapp.Circle;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle=new Circle();
		
		circle.setRadius(-7);
		circle.setStyle(BorderStyle.DOTTED);
		
		System.out.println("Radius "+circle.getRadius());
		System.out.println("Area Of Circle = "+circle.areaOfCircle());
		System.out.println("Border Style of Circle = "+circle.getStyle());
	}
}
