package com.techlabs.rectangle;

public class Rectangle {

	private int height;
	private int width;
	private String color;

	// public Rectangle(int height, int width) {
	// this.height = height;
	// this.width = width;
	// }
	public int getHeight() {
		return height;

	}

	public void setHeight(int height) {
		this.height = checkNumbers(height);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = checkNumbers(width);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = checkColors(color);
	}

	public int calculateArea() {
		System.out.println(height);
		int areaOfRectangle = getHeight() * getWidth();
		return areaOfRectangle;
	}

	int checkNumbers(int number) {
		if (number < 1) {
			return 1;
		} else if (number > 100) {
			return 100;
		} else {
			return number;
		}
	}

	String checkColors(String colors) {
		String color = colors.toLowerCase();
		if (color == "red" || color == "green" || color == "blue") {
			return colors;
		} else {
			return "Red";
		}
	}

}
