package com.techlabs.person;

public class Person {

	private String name;
	private int age;
	private Gender gneder;
	private float height;
	private int weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = (age);
	}

	public Gender getGneder() {
		return gneder;
	}

	public void setGneder(Gender gneder) {
		this.gneder = gneder;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {

		this.weight = (weight);
	}


	public void eat(int meal) {
		if (meal > 2) {
			setWeight(weight + 1);
		} else {
			setWeight(weight);
			
		}
	}

	public void workout(int time) {
		if (time > 45) {
			setWeight(weight - 1);
		} else {
			setWeight(weight);
		}
	}
}
