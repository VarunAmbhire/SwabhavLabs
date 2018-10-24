package com.techlab.simuduck;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Oops, I can't Fly!!!");
	}

}
