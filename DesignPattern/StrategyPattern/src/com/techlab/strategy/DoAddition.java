package com.techlab.strategy;

public class DoAddition implements IStrategy {

	@Override
	public int doOperation(int number1, int number2) {
		return number1 + number2;
	}

}
