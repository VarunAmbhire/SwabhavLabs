package com.techlabs.students;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class StudentSerialize {
	private String file = "resource\\stud.txt";

	public void serialize(ArrayList<Student> students) throws IOException {
		// ArrayList<Student> stud = new ArrayList<>();
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(students);
		objectOutputStream.close();
		fileOutputStream.close();
	}

	public ArrayList<Student> deserialize() throws Exception {
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		ArrayList<Student> student = (ArrayList<Student>) objectInputStream.readObject();
		objectInputStream.close();
		return student;
	}

}
