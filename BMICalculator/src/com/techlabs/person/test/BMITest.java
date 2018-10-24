package com.techlabs.person.test;

import com.techlabs.BMI.BMICalculation;
import com.techlabs.person.Gender;
import com.techlabs.person.Person;

public class BMITest {

	public static void main(String[] args) {


		BMICalculation bmiCalculation = new BMICalculation();
		Person person = new Person();
		person.setName("Dell");
		person.setAge(10);
		person.setGneder(Gender.MALE);
		person.setHeight(1.3f);
		person.setWeight(80);
		
		int bmi=bmiCalculation.calculateBMI(person);
		System.out.println("Pre Meal= "+bmi);
		person.eat(4);		
		bmi=bmiCalculation.calculateBMI(person);
		System.out.println("Post Meal="+bmi);

		person.workout(50);
		bmi=bmiCalculation.calculateBMI(person);
		System.out.println("Post Workout="+bmi);
//		Person person1 = new Person();
//		person1.setName("Sony");
//		person1.setAge(12);
//		person1.setGneder(Gender.FEMALE);
//		person1.setHeight(110);
//		person1.setWeight(40);
//		person1.eat(4);
//		person.workout(50);		
		
	}

	public static String printDetails(Person person) {
		String detail = person.getName() + "\n" + person.getAge() + "\n" + person.getGneder() + "\n"
				+ person.getHeight() + " Meter\nBefore Meal " + person.getWeight() + " Kg\nAfter Meal "
				+ person.getWeight()+"\nAfter Workout "+person.getWeight();
		return detail;
	}

}
