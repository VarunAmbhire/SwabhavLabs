package com.techlab.decoratorpattern;

public class ChineaseFood extends FoodDecorator {

	public ChineaseFood(Food newFood) {
		super(newFood);
	}

	@Override
	public String preparedFood() {
		return "Chinease Food Prepared";
	}

	@Override
	public double foodPrice() {
		return 200;
	}

}
