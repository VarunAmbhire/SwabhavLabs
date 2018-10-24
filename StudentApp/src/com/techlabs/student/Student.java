package com.techlabs.student;

import java.io.Serializable;

public class Student implements Serializable {
	private static int no;
	private int rollNo;
	private String name;
	private String company;

	static {
		no = 01;
	}

	public Student(String name, String company) {
		this.name = name;
		this.company = company;

		rollNo = no;
		no++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getRollNo() {
		return rollNo;
	}

	@Override
	public String toString() {
		return "rollNo=" + rollNo + "\nname=" + name + "\ncompany=" + company;
	}

	
}
