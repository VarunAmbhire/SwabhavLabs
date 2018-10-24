package com.techlab.CheckedUnchecked;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class CheckedException {

	public void checkedException() throws Exception {
		FileInputStream fileInputStream = new FileInputStream("prop.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		objectInputStream.close();

	}
}
