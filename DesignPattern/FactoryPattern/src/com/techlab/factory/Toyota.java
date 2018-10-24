package com.techlab.factory;

public class Toyota implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("Toyota started");
	}

	@Override
	public void stop() {
		System.out.println("Toyota stopped");
	}

}
