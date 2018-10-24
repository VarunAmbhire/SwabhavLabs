package com.techlab.srprefactor;

public class InvoiceRefractor {

	private int id;
	private String name;
	private int cost;
	private int discount;
	private int gst;

	public InvoiceRefractor(int id, String name, int cost, int discount) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
		this.gst = 12;
	}

	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public float calculation() {
		return cost + (gst / 100) + gst % 100;
	}

	public float calDiscount() {
		return calculation() - ((discount / 100) + discount % 100);

	}

	public int calTotalCost() {
		return cost;
	}

}
