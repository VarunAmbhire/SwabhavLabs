package com.techlab.collegeapp;

import java.util.ArrayList;

public class Professor extends Person {

	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public Professor calculateSalary(ArrayList<Professor>list) {

		
		return new Professor();
	}
}
