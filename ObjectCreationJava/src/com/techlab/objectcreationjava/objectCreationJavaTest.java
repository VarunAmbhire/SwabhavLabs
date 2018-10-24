package com.techlab.objectcreationjava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.*;

public class objectCreationJavaTest {

	public static void main(String[] args) throws Exception {

		Employee employee = new Employee();
		employee.setName("a");
		System.out.println(employee.getName() + " object createed by using new keyword");

		Employee employee2 = Employee.class.newInstance();
		employee2.setName("b");
		System.out.println(employee2.getName() + " object createed by using newInstance() keyword");


		Constructor<Employee> constructor = Employee.class.getConstructor();
		Employee employee3 = constructor.newInstance();
		employee3.setName("c");

		Employee employee4 = employee3;
		employee4.setName("d");

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("employee.obj"));
		objectOutputStream.writeObject(employee3);
		objectOutputStream.close();

		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("employee.obj"));
		Employee employee5 = (Employee) objectInputStream.readObject();
		objectInputStream.close();
		employee5.setName("e");

		System.out.println(employee.getName() + ", " + employee2.getName() + ", " + employee3.getName() + ", "
				+ employee4.getName() + ", " + employee5.getName());

	}

}