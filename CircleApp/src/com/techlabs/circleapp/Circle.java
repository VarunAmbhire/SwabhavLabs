package com.techlabs.circleapp;

public class Circle {

	private int radius;
	private BorderStyle borderStyle;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = checkRadius(radius);
	}

	public BorderStyle getStyle() {
		return borderStyle;
	}

	public void setStyle(BorderStyle style) {
		this.borderStyle = style;
	}

	public double areaOfCircle() {
		double area = 3.14 * Math.PI * getRadius();
		return area;
	}
	
	public int checkRadius(int radius) {
		if(radius<1) {
			return 1;
		}else {
			return radius;
		}
	}
}
