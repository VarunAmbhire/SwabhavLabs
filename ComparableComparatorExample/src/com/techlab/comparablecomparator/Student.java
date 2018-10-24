package com.techlab.comparablecomparator;

public class Student implements Comparable<Student> {

	private int rollNumber;
	private String name;
	private int age;

	public Student(int rollNumber, String name, int age) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	

	@Override
	public int compareTo(Student o) {
		return this.rollNumber - o.rollNumber;
	}

}
