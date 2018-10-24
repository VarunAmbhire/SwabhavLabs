package com.techlab.EmployeeDataAnalyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class DiskLoader implements ILoader {
	String file = "resource\\EmployeeDetails.csv";
	ArrayList<String> list = new ArrayList<>();

	public ArrayList<String> load() throws Exception {
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			list.add(line);
		}
		bufferedReader.close();
		return list;
	}
}
