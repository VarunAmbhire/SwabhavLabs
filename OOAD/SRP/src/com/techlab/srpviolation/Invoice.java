package com.techlab.srpviolation;

public class Invoice {
	private int id;
	private String name;
	private int cost;
	private int discount;
	private int gst;

	public Invoice(int id, String name, int cost, int discount) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
		this.gst = 12;
	}
	
	

	public float calculation() {
		return cost + (gst / 100) + gst % 100;
	}

	public float calculateDiscount() {
		return calculation() - ((discount / 100)+discount%100);

	}

	public int calculateTotalCost() {
		return cost;
	}

	public void printDetails() {
		System.out.println(id + " " + name + " has cost of " + calculateTotalCost() + " including GST " + calculation()
				+ " on discount " + calculateDiscount());

	}

}
