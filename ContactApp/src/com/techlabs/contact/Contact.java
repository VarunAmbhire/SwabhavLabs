package com.techlabs.contact;

import java.io.Serializable;

public class Contact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ID;
	private String name;
	private String company;

	public Contact() {
		super();
	}

	public Contact(int iD, String name, String company) {
		ID = iD;
		this.name = name;
		this.company = company;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

//	@Override
//	public String toString() {
//		return ID + "\t" + name + "\t" + company+"\n";
//	}

}
