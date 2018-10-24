package com.techlabs.cutomertest;

import com.techlabs.customer.Customer;

public class CustomerCounterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Customer c1=new Customer(0, "","");	
	System.out.println(c1.howMany());

	Customer c2=new Customer(0, "","");	
	System.out.println(c1.howMany());
	
	Customer c3=new Customer(4, "","");	
	System.out.println(c3.howMany());
	
	Customer c4=new Customer(4, "","");	
	Customer c5=new Customer(4, "","");	
	Customer c6=new Customer(4, "","");	
	
	System.out.println(Customer.HeadCount());
	}
}
