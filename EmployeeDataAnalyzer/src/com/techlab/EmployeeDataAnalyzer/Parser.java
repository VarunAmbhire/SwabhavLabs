package com.techlab.EmployeeDataAnalyzer;

import java.util.ArrayList;

public class Parser {
	Employee employee;
	String csvSplitBy = ",";

	public ArrayList<Employee> parse(ILoader iLoader) throws Exception {
		ArrayList<Employee> employees = new ArrayList<>();
		for (String line : iLoader.load()) {
			String[] details = line.split(csvSplitBy);
			employee = new Employee();
			employee.setEmployeeId(Integer.parseInt(details[0]));
			employee.setEmployeeName(details[1]);
			employee.setEmployeeDesignation(details[2]);
			employee.setManagerId(details[3]);
			employee.setDateOfJoining(details[4]);
			employee.setSalary(Integer.parseInt(details[5]));
			employee.setCommission(details[6]);
			employee.setDepartmentNumber(Integer.parseInt(details[7]));
			employees.add(employee);
		}
		return employees;
	}

}
