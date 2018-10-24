package com.techlab.collegeapp;

import java.util.ArrayList;

public class College implements ISalaryCalculation {

	private ArrayList<Student> listOfStudent = new ArrayList<>();
	private ArrayList<Professor> listOfProfessor = new ArrayList<>();

	public ArrayList<Student> getListOfStudent() {
		return listOfStudent;
	}

	public void setListOfStudent(ArrayList<Student> listOfStudent) {
		this.listOfStudent = listOfStudent;
	}

	public ArrayList<Professor> getListOfProfessor() {
		return listOfProfessor;
	}

	public void setListOfProfessor(ArrayList<Professor> listOfProfessor) {
		this.listOfProfessor = listOfProfessor;
	}

	@Override
	public Professor calculateSalary(ArrayList<Professor> list) {
		return null;
	}

}
