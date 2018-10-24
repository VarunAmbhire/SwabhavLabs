package com.techlab.setforcomplexdata;

public class Student implements Comparable<Student> {

	private int rollNo;
	private String name;
	private String company;

	public Student(int rollNo, String name, String company) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.company = company;
	}

	public int getRollNso() {
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public int compareTo(Student o) {
		return getName().compareTo(o.getName());
	}

}
