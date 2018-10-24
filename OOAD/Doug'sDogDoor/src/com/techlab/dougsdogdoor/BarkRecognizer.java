package com.techlab.dougsdogdoor;

import java.util.Iterator;
import java.util.List;

public class BarkRecognizer {

	private DogDoor door;

	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}

	public void recognize(Bark bark) {
		System.out.println("\nBark Recognizer heard " + bark);
		List allowedBark = door.getAllowedBark();
		for (Iterator itr = allowedBark.iterator(); itr.hasNext();) {
			Bark allowedDog = (Bark) itr.next();
			if (allowedDog.equals(bark)) {
				door.open();
				return;
			}
		}
		System.out.println("This Dog is Not allowed.");
	}
}
