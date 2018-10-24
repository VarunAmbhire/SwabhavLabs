package com.techlab.ShoppingCartTest;

import com.techlab.ShoppingCart.Customer;
import com.techlab.ShoppingCart.LineItem;
import com.techlab.ShoppingCart.Order;
import com.techlab.ShoppingCart.Product;

public class ShoppingCartTest {
	public static void main(String[] args) {
		Customer customer = new Customer("XYZ", 121);
		Product product = new Product("Dell Laptop", 4512, 50000, 10);
		Product product2 = new Product("Mobile Phone", 142, 4000, 12);
		LineItem lineItem = new LineItem(35, 7, product);
		LineItem lineItem2 = new LineItem(36, 2, product2);
		Order order = new Order("15-01-18");
		order.setListOfLineItem(lineItem);
		order.setListOfLineItem(lineItem2);

		System.out.println(customer.addToCart(order));
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Total price of purchase on " + order.getDate() + " " + customer.checkOutPrice(order));

		System.out.println("--------------------------------------------------------------------");
		System.out.println("Cost Of " + product.getProductName() + " " + product.costAfterDiscount());
		System.out.println("Cost of" + product2.getProductName() + " " + product2.costAfterDiscount());

		System.out.println("--------------------------------------------------------------------");
		System.out.println("Total Cost of " + lineItem.getLineItem() + " " + lineItem.totalCostOfItem());
		System.out.println("Total Cost of " + lineItem2.getLineItem() + " " + lineItem2.totalCostOfItem());

	}
}
