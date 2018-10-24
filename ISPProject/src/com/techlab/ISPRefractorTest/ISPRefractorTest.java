package com.techlab.ISPRefractorTest;

import com.techlab.ISPRefractor.IEat;
import com.techlab.ISPRefractor.IWork;
import com.techlab.ISPRefractor.Manager;
import com.techlab.ISPRefractor.Robot;

public class ISPRefractorTest {

	public static void main(String[] args) {
		Manager manager = new Manager();
		Robot robot = new Robot();

		atCafetaria(manager);
		System.out.println("------------------------------");

		atWorkStation(manager);
		System.out.println("------------------------------");
		
		atWorkStation(robot);

	}

	private static void atCafetaria(IEat eat) {
		eat.startEat();
		eat.stopEat();
	}

	private static void atWorkStation(IWork work) {
		work.startWork();
		work.stopWork();
	}

}
