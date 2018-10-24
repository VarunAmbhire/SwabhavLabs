package com.techlab.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private String date;
	private List<LineItem> listOfLineItem = new ArrayList<>();

	public Order(String date) {
		this.date = date;
	}

	public void setListOfLineItem(LineItem lineItem) {
		listOfLineItem.add(lineItem);
	}

	public String getDate() {
		return date;
	}

	public List<LineItem> getListOfLineItem() {
		return listOfLineItem;
	}

}
