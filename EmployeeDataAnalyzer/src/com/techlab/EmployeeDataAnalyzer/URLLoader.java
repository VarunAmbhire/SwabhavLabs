package com.techlab.EmployeeDataAnalyzer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class URLLoader implements ILoader {

	private static String URL = "https://swabhav-tech.firebaseapp.com/emp.txt";
	ArrayList<String> list = new ArrayList<>();

	public ArrayList<String> load() throws Exception {
		URL url = new URL(URL);
		URLConnection urlConnection = url.openConnection();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			list.add(line);
		}
		bufferedReader.close();
		return list;
	}

}
