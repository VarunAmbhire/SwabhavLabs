package com.techlab.dougsdogdoor;

import java.util.ArrayList;
import java.util.List;

public class DogDoor {

	private boolean open;
	private static List<Bark> allowedBark;

	
	public DogDoor() {
		this.open = false;
		allowedBark = new ArrayList<>();		
	}

	public void open() {
		System.out.println("Dog Door is Open");
		open = true;
	}

	public void close() {
		System.out.println("Dog door is close");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}

	public List<Bark> getAllowedBark() {
		return allowedBark;
	}

	public void addAllowedBark(Bark bark) {
		
		allowedBark.add(bark);
	}
}
