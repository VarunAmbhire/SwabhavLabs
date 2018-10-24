package com.techlab.interfaceapp;

public class DepartmentDB implements ICradable {

	@Override
	public void create() {
		System.out.println("Department Created");

	}

	@Override
	public void read() {
		System.out.println("Department Read");

	}

	@Override
	public void update() {
		System.out.println("Department Updated");

	}

	@Override
	public void delete() {
		System.out.println("Department Deleted");

	}

}
