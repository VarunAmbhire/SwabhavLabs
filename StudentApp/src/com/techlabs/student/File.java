package com.techlabs.student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class File {

	public void write(Object obj, String fileName) throws Exception {

		FileOutputStream fileOutputStream = new FileOutputStream(fileName);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(obj);
		fileOutputStream.close();
	}

	public  Object read(String fileName) throws Exception {

		FileInputStream fileInputStream = new FileInputStream(fileName);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Object obj=objectInputStream.readObject();
		objectInputStream.close();
		return obj;
	}
}
