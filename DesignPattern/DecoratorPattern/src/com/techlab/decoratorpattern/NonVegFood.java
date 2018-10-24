package com.techlab.decoratorpattern;

public class NonVegFood extends FoodDecorator {

	public NonVegFood(Food newFood) {
		super(newFood);
	}

	@Override
	public String preparedFood() {
		
		return "NonVeg Food Prepared";
	}

	@Override
	public double foodPrice() {
		return 150;
	}

}
