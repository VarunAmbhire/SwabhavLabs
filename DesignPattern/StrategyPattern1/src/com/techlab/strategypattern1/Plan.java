package com.techlab.strategypattern1;

public abstract class Plan {
	protected double rate;

	public abstract double getRate();

	public double calculateBill(int units) {
		return units * getRate();
	}
}
