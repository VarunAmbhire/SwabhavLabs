package com.techlab.EmployeeDataAnalyzer;

import java.util.ArrayList;
import java.util.TreeSet;

public class Analyzer {

	public String maximumSalarisedEmployee(TreeSet<Employee> list) throws Exception {
		ArrayList<Employee> listOfEmployee = new ArrayList<>();
		listOfEmployee.addAll(list);
		int lastEmployee = listOfEmployee.size() - 1;
		return listOfEmployee.get(lastEmployee).getEmployeeId() + " "
				+ listOfEmployee.get(lastEmployee).getEmployeeName() + " "
				+ listOfEmployee.get(lastEmployee).getEmployeeDesignation() + " "
				+ listOfEmployee.get(lastEmployee).getSalary();
	}

	public int totalNumberOfEmployee(TreeSet<Employee> listOfEmployee) throws Exception {
		return listOfEmployee.size();
	}
}
