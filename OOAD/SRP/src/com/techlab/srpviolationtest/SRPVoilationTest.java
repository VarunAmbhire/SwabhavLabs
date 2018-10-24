package com.techlab.srpviolationtest;

import com.techlab.srpviolation.Invoice;

public class SRPVoilationTest {
	public static void main(String[] args) {
		Invoice invoice=new Invoice(10, "Phone", 100,21);
		
		invoice.printDetails();
	}
}
