package com.techlab.thread;

import java.util.Date;

public class Control extends Thread{
	Date time = new Date();

	public void syncTask() {
		while (true) {
			System.out.println(time);
		}
	}

	public void asyncTask()  {
	
		
	}

	public void helloWorld() {
		System.out.println("Hello World!!!");
	}

	@Override
	public void run() {
		while(true) {	
			System.out.println(time);
	}
	}
}
