package com.techlabs.student.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.techlabs.students.Student;
import com.techlabs.students.StudentSerialize;

public class StudentTest {

	public static void main(String[] args) throws Exception {
		ArrayList<Student> students = new ArrayList<>();

		StudentSerialize studentSerialize = new StudentSerialize();
		for (Student student : studentSerialize.deserialize()) {
			students.add(student);
		}

		Scanner scanner = new Scanner(System.in);
		int i = 1;
		do {
			i = scanner.nextInt();
			System.out.println("Enter Roll No. : ");
			int rollNo = scanner.nextInt();

			System.out.println("Enter Name : ");
			String name = scanner.next();

			Student student = new Student(rollNo, name);
			students.add(student);
		} while (i == 1);

		studentSerialize.serialize(students);
		// System.out.println(studentSerialize.deserialize());

		for (Student student : students) {
			System.out.println("Students Roll No. : "+student.getRollNo() + ", ");
			System.out.println("Students Name      : "+student.getName() + ", ");
			System.out.println("");
		}
		
	}

}
