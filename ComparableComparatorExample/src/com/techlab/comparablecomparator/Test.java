package com.techlab.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		ArrayList<Student> listOfStudent = new ArrayList<>();

		Student student = new Student(22, "Army", 20);
		Student student2 = new Student(14, "Navy", 19);
		Student student3 = new Student(21, "AirF", 21);

		listOfStudent.add(student);
		listOfStudent.add(student2);
		listOfStudent.add(student3);

		Collections.sort(listOfStudent);
		print(listOfStudent);

		System.out.println("--------------------------------");
		System.out.println("Compare By Name Comparator ");
		NameCompare nameCompare = new NameCompare();
		Collections.sort(listOfStudent, nameCompare);
		print(listOfStudent);

		System.out.println("--------------------------------");
		System.out.println("Compare By Age Comparator ");
		AgeCompare ageCompare = new AgeCompare();
		Collections.sort(listOfStudent, ageCompare);
		print(listOfStudent);
	}

	private static void print(ArrayList<Student> list) {
		System.out.println("Roll No. Name\t\tAge");
		for (Student stud : list) {
			System.out.println(stud.getRollNumber()+" \t "+stud.getName()+"\t\t "+stud.getAge());
		}
	}
}
