package com.techlab.factory;

public class BMW implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("BMW Started");
	}

	@Override
	public void stop() {
		System.out.println("BMW Stopped");
	}

}
