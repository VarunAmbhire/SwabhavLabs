package com.techlab.dougsdogdoor;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		door.addAllowedBark(new Bark("rowfl"));
		door.addAllowedBark(new Bark("rooowfl"));
		door.addAllowedBark(new Bark("rawfl"));
		door.addAllowedBark(new Bark("woof"));
		

		BarkRecognizer barkRecognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);


		System.out.println("Bruce start Barking");
		barkRecognizer.recognize(new Bark("rowfl"));

		System.out.println("\nBruce has gone outside...");

		try {
			Thread.currentThread();
			Thread.sleep(10000);
		} catch (Exception e) {
		}

		System.out.println("\nBruce all done.");
		System.out.println("..But he stuck outside");

		Bark smallDog = new Bark("Yip!");
		System.out.println("\nSmall Dog Barking");
		barkRecognizer.recognize(smallDog);

		try {
			Thread.currentThread().sleep(5000);
		} catch (Exception e) {
		}
		
		System.out.println("bruce starts Barking.");
		barkRecognizer.recognize(new Bark("rooowfl"));
		
		System.out.println("bruce back inside");
	}
}
