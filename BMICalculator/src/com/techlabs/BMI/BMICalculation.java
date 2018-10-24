package com.techlabs.BMI;

import com.techlabs.person.Person;

public class BMICalculation {

	// Person person = new Person();

	public int calculateBMI(Person person) {
		float height = person.getHeight() ;
		float sqaureHeight =   (height * height);
		int weight = person.getWeight();
		System.out.println(sqaureHeight + " " + weight);
		int bmi = (int) (weight / sqaureHeight);
		return bmi;
	}
}
