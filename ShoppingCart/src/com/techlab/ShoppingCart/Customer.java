package com.techlab.ShoppingCart;

public class Customer {

	private String customerName;
	private int customerId;

	public Customer() {
		super();
	}

	public Customer(String customerName, int customerId) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String addToCart(Order order) {
		StringBuilder list = new StringBuilder();
		for (int index = 0; index < order.getListOfLineItem().size(); index++) {
			list.append(order.getListOfLineItem().get(index).getProduct().getProductName() + ", ");
		}

		return "Customer Name " + this.customerName + " Ordered on " + order.getDate() + " these Products " + list;
	}

	public int checkOutPrice(Order order) {
		int price = 0;
		for (int index = 0; index < order.getListOfLineItem().size(); index++) {
			price = price + order.getListOfLineItem().get(index).getProduct().costAfterDiscount();
		}
		return price;
	}
}
