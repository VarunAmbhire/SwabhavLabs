package com.techlab.decoratorpattern;

public class VegFood implements Food {

	@Override
	public String preparedFood() {
		return "Veg Food prepared";
	}

	@Override
	public double foodPrice() {
		return 100;
	}

}
