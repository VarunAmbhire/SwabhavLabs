package com.techlab.EmployeeDataAnalyzerTest;

import java.util.TreeSet;

import com.techlab.EmployeeDataAnalyzer.DiskLoader;
import com.techlab.EmployeeDataAnalyzer.Employee;
import com.techlab.EmployeeDataAnalyzer.Parser;
import com.techlab.EmployeeDataAnalyzer.URLLoader;

public class EmployeeDataAnalyzerTest {

	public static void main(String[] args) throws Exception {
		Parser parser = new Parser();
		URLLoader urlLoader = new URLLoader();
		DiskLoader diskLoader = new DiskLoader();

		TreeSet<Employee> listFromURL = new TreeSet<>();
		TreeSet<Employee> listFromDisk = new TreeSet<>();

		listFromURL.addAll(parser.parse(urlLoader));
		listFromDisk.addAll(parser.parse(diskLoader));

		EmployeeSorter employeeSorter = new EmployeeSorter(listFromDisk);

		employeeSorter.getHead().printDetails();

		// System.out.println("Maximum Salarised " +
		// analyzer.maximumSalarisedEmployee(listFromURL));
		// System.out.println("Total Number of Employees " +
		// analyzer.totalNumberOfEmployee(listFromURL));
		// System.out.println("---------------------------------------------------------------------------------");
		//
		// System.out.println("List From URL : ");
		// printList(listFromURL);
		// System.out.println("---------------------------------------------------------------------------------");
		// System.out.println("---------------------------------------------------------------------------------");
		//
		// System.out.println("List From Disk : ");
		// printList(listFromDisk);
	}

	// private static void printList(TreeSet<Employee> list) {
	// for (Employee employee : list) {
	// System.out.println(employee.getEmployeeId() + " " +
	// employee.getEmployeeName() + " "
	// + employee.getDateOfJoining() + " " + employee.getEmployeeDesignation() + " "
	// + employee.getManagerId() + " " + employee.getSalary() + " " +
	// employee.getCommission() + " "
	// + employee.getDepartmentNumber());
	// }
	// }

}
