package com.techlab.ISPViolation;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Robot start Working");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot stop Working");
	}

	@Override
	public void startEat() {
		System.out.println("Robot start Eating");
	}

	@Override
	public void stopEat() {
		System.out.println("Robot stop Eating");
	}
}
