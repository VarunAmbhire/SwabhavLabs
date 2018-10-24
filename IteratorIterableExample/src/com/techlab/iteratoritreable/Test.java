package com.techlab.iteratoritreable;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		ArrayList<Student> listOfStudent = new ArrayList<>();

		Student student = new Student(22, "Army", 20);
		Student student2 = new Student(14, "Navy", 19);
		Student student3 = new Student(21, "AirF", 21);

		listOfStudent.add(student);
		listOfStudent.add(student2);
		listOfStudent.add(student3);

		System.out.println("Iterable Interface");
		for (Student stud : listOfStudent) {
			System.out.println("Roll Number : "+stud.getRolNumber()+", Name : "+stud.getName()+", Age : "+stud.getAge());
		}

		System.out.println("-----------------------------------");
		System.out.println("Iterator Interface ");
		Iterator iterator = listOfStudent.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}