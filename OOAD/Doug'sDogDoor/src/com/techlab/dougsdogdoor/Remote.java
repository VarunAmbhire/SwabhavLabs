package com.techlab.dougsdogdoor;

import java.util.Timer;
import java.util.TimerTask;

public class Remote {

	private DogDoor door;

	public Remote(DogDoor door) {
		this.door = door;
	}

	public void pressButton() {
		System.out.println("Pressing the Button");
		if (door.isOpen()) {
			door.close();
		} else {
			door.open();

			Timer timer = new Timer();
			timer.schedule(new TimerTask() {
				@Override
				public void run() {
					door.close();
					timer.cancel();
				}
			}, 5000);
		}
	}

}
