package com.techlab.singletontest;

import com.techlab.singleton.DataService;

public class Test {

	public static void main(String[] args) throws Exception {
		DataService  dataService=DataService.getInstance();		
		DataService  dataService1=DataService.getInstance();

		DataService  dataService3=DataService.getInstance();		
		DataService  dataService4=DataService.getInstance();
		
		
		System.out.println(dataService.hashCode());
		System.out.println(dataService1.hashCode());
		System.out.println(dataService3.hashCode());
		System.out.println(dataService4.hashCode());
	}

}
