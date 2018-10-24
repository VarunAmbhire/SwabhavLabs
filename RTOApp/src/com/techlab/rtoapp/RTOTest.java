package com.techlab.rtoapp;

import java.util.ArrayList;
import java.util.Set;

public class RTOTest {

	public static void main(String[] args) throws Exception {

		DataBase dataBase = new DataBase();
		Display display = new Display();
		Search search = new Search();

		ArrayList<RTO> rtos = new ArrayList<>();
		System.out.println(dataBase.read());

		Set<String> set = dataBase.read().stringPropertyNames();
		for (String string : set) {
			rtos.add(new RTO(string, dataBase.read().getProperty(string)));
		}
		
		System.out.println(search.search("kas", rtos));
	}

}
