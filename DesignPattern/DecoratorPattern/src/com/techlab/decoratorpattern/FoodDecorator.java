package com.techlab.decoratorpattern;

public abstract class FoodDecorator implements Food {

	private Food newFood;

	public FoodDecorator(Food newFood) {
		this.newFood = newFood;
	}

	@Override
	public String preparedFood() {
		return this.newFood.preparedFood();
	}

	@Override
	public double foodPrice() {
		return this.newFood.foodPrice();
	}

}
