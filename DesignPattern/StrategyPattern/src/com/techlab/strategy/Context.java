package com.techlab.strategy;

public class Context {

	IStrategy strategy;

	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}

	public String executeStrategy(int num1, int num2) {
		String result = strategy.getClass().getName().replaceAll("com.techlab.strategy.Do", "") + " of " + num1
				+ " and " + num2 + " is " + strategy.doOperation(num1, num2);
		return result;
	}

}
