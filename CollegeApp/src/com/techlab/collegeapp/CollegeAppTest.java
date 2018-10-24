package com.techlab.collegeapp;

import java.util.ArrayList;

public class CollegeAppTest {

	public static void main(String[] args) {

		College college = new College();
		Student student = new Student();
		Professor professor=new Professor();

		ArrayList<Student> students = new ArrayList<>();

		student.setId(100);
		student.setAddress("Mumbai");
		student.setDob("8/2/78");
		student.setBranch(Branch.COMPUTER);

		students.add(student);

		college.setListOfStudent(students);

		System.out.println(students.get(0).getBranch());
		System.out.println(professor.calculateSalary(professor.getListOfProfessor()));
	}

}
