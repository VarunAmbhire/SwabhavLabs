package com.techlab.ISPRefractor;

public class Manager implements IWork, IEat {

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
