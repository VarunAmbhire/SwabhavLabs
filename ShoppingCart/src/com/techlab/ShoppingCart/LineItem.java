package com.techlab.ShoppingCart;

public class LineItem {

	private int lineItemId;
	private int quantity;
	private Product product;

	public LineItem(int lineItemId, int quantity, Product product) {
		this.lineItemId = lineItemId;
		this.quantity = quantity;
		this.product = product;
	}

	public int getLineItem() {
		return lineItemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}

	public int totalCostOfItem() {
		return quantity * product.costAfterDiscount();
	}
}
