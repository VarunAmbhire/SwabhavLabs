package com.techlab.strategy;

public class DoSubtraction implements IStrategy {

	@Override
	public int doOperation(int number1, int number2) {
		return number1 - number2;
	}

}
