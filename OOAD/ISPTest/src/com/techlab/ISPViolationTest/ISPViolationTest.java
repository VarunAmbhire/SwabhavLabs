package com.techlab.ISPViolationTest;

import com.techlab.ISPViolation.IWorker;
import com.techlab.ISPViolation.Manager;
import com.techlab.ISPViolation.Robot;

public class ISPViolationTest {

	public static void main(String[] args) {
		Manager manager = new Manager();
		Robot robot = new Robot();
		
		atCafetaria(manager);
		atCafetaria(robot);
		
		atWorkStation(manager);
		atWorkStation(robot);

	}

	private static void atCafetaria(IWorker iWorker) {
		iWorker.startWork();
		iWorker.stopWork();
		iWorker.startEat();
		iWorker.stopEat();
	}

	private static void atWorkStation(IWorker iWorker) {
		iWorker.startWork();
		iWorker.stopWork();
		iWorker.startEat();
		iWorker.stopEat();
	}
}
