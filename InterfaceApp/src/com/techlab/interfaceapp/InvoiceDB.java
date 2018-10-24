package com.techlab.interfaceapp;

public class InvoiceDB implements ICradable {

	@Override
	public void create() {
		System.out.println("Invoice Created");
	}

	@Override
	public void read() {
		System.out.println("Invoice Read");
	}

	@Override
	public void update() {
		System.out.println("Invoice updated");

	}

	@Override
	public void delete() {
		System.out.println("Invoice Deleted");
	}

}
