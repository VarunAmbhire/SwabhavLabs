package com.techlab.interfaceapp;

public class CustomerDB implements ICradable {

	@Override
	public void create() {
		System.out.println("Customer Created");
	}

	@Override
	public void read() {
		System.out.println("Customer Read");
	}

	@Override
	public void update() {
		System.out.println("Customer Updated");
	}

	@Override
	public void delete() {
		System.out.println("Customer Deleted");
	}

}
