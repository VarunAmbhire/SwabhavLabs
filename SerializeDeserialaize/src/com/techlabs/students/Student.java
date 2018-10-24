package com.techlabs.students;

import java.io.Serializable;

public class Student implements Serializable {
	private int rollNo;
	private String name;

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "rollNo=" + rollNo + ", name=" + name;
	}

}
