package com.techlab.mutableimmutable;

public class ImmutableStudent {
	private int rollNumber;
	private String name;

	public ImmutableStudent(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

}
