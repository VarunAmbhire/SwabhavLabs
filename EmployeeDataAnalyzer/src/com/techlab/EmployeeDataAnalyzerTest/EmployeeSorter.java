package com.techlab.EmployeeDataAnalyzerTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import com.techlab.EmployeeDataAnalyzer.Employee;

public class EmployeeSorter {



	private HashMap<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
	private ArrayList<Employee> employeeList = new ArrayList<>();
	private Employee CEO;

	public EmployeeSorter(TreeSet<Employee> list) throws Exception {
		employeeList.addAll(list);
		makeHeirarchy();
		getCEO();
	}

	public void makeHeirarchy() {

		for (Employee e : employeeList) {
			if (!employeeMap.containsKey(e.getEmployeeId())) {
				employeeMap.put(e.getEmployeeId(), e);
			}
		}

		for (Employee e : employeeList) {
			String managerID = e.getManagerId();
			if (managerID.equals("NULL")) {
				managerID = "0";
			}
			if (employeeMap.containsKey(Integer.parseInt(managerID))) {
				employeeMap.get(Integer.parseInt(managerID)).addReportee(e);
			}
		}
	}

	public void getCEO() {
		CEO = employeeMap.get(7839);
	}

	public Employee getHead() {
		return CEO;
	}

	public Map<Integer, Employee> getMap() {
		return employeeMap;
	}

}
