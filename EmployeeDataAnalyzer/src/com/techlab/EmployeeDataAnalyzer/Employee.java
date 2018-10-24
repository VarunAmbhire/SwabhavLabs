package com.techlab.EmployeeDataAnalyzer;

import java.util.ArrayList;

import com.sun.org.apache.regexp.internal.recompile;

public class Employee implements Comparable<Employee> {

	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	private String managerId;
	private String dateOfJoining;
	private int salary;
	private String commission;
	private int departmentNumber;
	private ArrayList<Employee> reporteeList;

	public Employee() {
		super();
		reporteeList = new ArrayList<>();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCommission() {
		return commission;
	}

	public void setCommission(String commission) {
		this.commission = commission;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	@Override
	public int compareTo(Employee o) {
		return this.salary - o.salary;
	}

	public ArrayList<Employee> getReporteeList() {
		return reporteeList;
	}
	
	public StringBuilder getReportee(){
		StringBuilder data=new StringBuilder();
		for(Employee employee:getReporteeList()) {
			data.append(employee.getEmployeeDesignation()+" "+employee.getEmployeeName()+"|");
		}
		return data;
	}

	public void setReporteeList(ArrayList<Employee> reporteeList) {
		this.reporteeList = reporteeList;
	}

	public void addReportee(Employee employee) {
		reporteeList.add(employee);
	}

	public void printDetails() {
		System.out.println(this.getEmployeeDesignation() + " " + this.getEmployeeName() + "\t\t");
		for (Employee employee : this.getReporteeList()) {
			System.out.println("\t" + employee.getEmployeeDesignation() + " " + employee.getEmployeeName() + "\n\t\t"
					+ employee.getReportee());
		}
	}

}
