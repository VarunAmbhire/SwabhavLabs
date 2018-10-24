package com.techlab.CustomExceptionApp;

public class CustomExceptionTest {

	public static void main(String[] args) {
		Student students[] = new Student[3];
		students[0] = new Student(10, "", "");
		students[1] = new Student(11, "", "");
		students[2] = new Student(12, "", "");

		try {
			studentSearch(1, students);
			System.out.println("");
		} catch (StudentNotFoundException e) {
			e.printStackTrace();
		}
	}

	static void studentSearch(int rollNumber, Student[] students) throws StudentNotFoundException {
		for (Student student : students) {
			if (rollNumber == student.getRollNo()) {
				System.out.println("Student Found");
				return;
			}
		}
		throw new StudentNotFoundException("Student not found " + rollNumber);

	}
}
