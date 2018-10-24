package com.techlab.srprefactor;

public class Print {
	InvoiceRefractor invoiceRefractor = new InvoiceRefractor(12, "TV", 500, 13);

	public void printDetails() {
		System.out.println(invoiceRefractor.getId() + " " + invoiceRefractor.getName() + " has cost of "
				+ invoiceRefractor.calTotalCost() + " including GST " + invoiceRefractor.calculation() + " on discount "
				+ invoiceRefractor.calDiscount());

	}
}
