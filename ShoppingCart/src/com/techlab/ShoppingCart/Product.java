package com.techlab.ShoppingCart;

public class Product {
	private String productName;
	private int productId;
	private int cost;
	private int discount;

	public Product(String productName, int productId, int cost, int discount) {
		this.productName = productName;
		this.productId = productId;
		this.cost = cost;
		this.discount = discount;
	}

	public String getProductName() {
		return productName;
	}

	public int getProductId() {
		return productId;
	}

	public int getCost() {
		return cost;
	}

	public int getDiscount() {
		return discount;
	}

	public int costAfterDiscount() {
		return cost - (cost * discount / 100);
	}
}
