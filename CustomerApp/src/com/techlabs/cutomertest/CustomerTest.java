package com.techlabs.cutomertest;

import com.techlabs.customer.CardType;
import com.techlabs.customer.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c1 = new Customer(1, "Albert", "Einstein");
		Customer c2 = new Customer(2, "Stephen", "Hawking", CardType.MASTER_CARD, true, 1000);

//		Customer temp = c1;
		System.out.println(printDetails(c1));

		Customer rich = c1.whoIsRich(c2);
		System.out.println(rich.getFirstName() + " " + rich.getLastName());

		// System.err.println(temp.getFirstName());
		// temp = null;
		// System.out.println(temp.getFirstName());

		double totalOfBalance = 0;
		Customer[] manyCustomer = new Customer[5];
		manyCustomer[0]=new Customer(0, " ", "", CardType.AMERICAN_EXPRESS,false,1500);
		manyCustomer[1]=new Customer(1, " ", "", CardType.MASTER_CARD,false,3500);
		manyCustomer[2]=new Customer(2, " ", "", CardType.RuPAY,false,1900);
		manyCustomer[3]=new Customer(3, " ", "", CardType.VISA,false,1540);
		manyCustomer[4]=new Customer(4, " ", "", CardType.AMERICAN_EXPRESS,false,5000);
//		for (int i = 0; i < manyCustomer.length; i++) {
//			manyCustomer[i] = new Customer(i, "", "");
//		}

		for (int i = 0; i < manyCustomer.length; i++) {
			totalOfBalance = totalOfBalance + manyCustomer[i].getBalance();
		}
		System.out.println("Total balance of " + manyCustomer.length + " is " + totalOfBalance);
	}

	static String printDetails(Customer customer) {

		return "ID : " + customer.getId() + "\nName : " + customer.getFirstName() + " " + customer.getLastName()
				+ "\nCard Type : " + customer.getCardType() + "\nHas Loan : " + customer.isHasLoan() + "\nBalance : "
				+ customer.getBalance() + "\nIs Eligible for Loan : " + customer.checkEligibleForLoan();
	}
}
