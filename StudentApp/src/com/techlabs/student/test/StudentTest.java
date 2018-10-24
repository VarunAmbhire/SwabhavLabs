package com.techlabs.student.test;

import com.techlabs.student.File;
import com.techlabs.student.Student;

public class StudentTest {

	public static void main(String[] args) throws Exception {

		String fileName="E:\\student.txt";
		Student student = new Student("Sachin", "asd");
		File file = new File();
		file.write(student, fileName);
		System.out.println(file.read(fileName));

	}

}
