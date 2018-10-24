package com.techlab.ISPViolation;

public class Manager implements IWorker {

	public void startWork() {
		System.out.println("Manager start Working");
	}

	public void stopWork() {
		System.out.println("Manager stop Working");
	}

	public void startEat() {
		System.out.println("Manager start Eating");
	}

	public void stopEat() {
		System.out.println("Manager stop Eating");
	}

}
