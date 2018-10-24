package com.techlabs.customer;

public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	private CardType cardType;
	private boolean hasLoan;
	private double balance;
	private static int countCustomer;

	public Customer(int id, String firstName, String lastName, CardType cardType, boolean hasLoan, double balance) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cardType = cardType;
		this.hasLoan = hasLoan;
		this.balance = balance;
		countCustomer++;
		System.out.println("Customer Created");
	}
	
	static {
		countCustomer=100;
		System.out.println("static block");
	}

	public Customer(int id, String firstName, String lastName) {
		this(id, firstName, lastName, CardType.VISA, false, 500);
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public CardType getCardType() {
		return cardType;
	}

	public boolean isHasLoan() {
		return hasLoan;
	}

	public double getBalance() {
		return balance;
	}

	public boolean checkEligibleForLoan() {
		if (hasLoan) {
			return false;
		} else if (hasLoan == false && balance < 50000) {
			return false;
		}
		return true;
	}

	public Customer whoIsRich(Customer customer) {
		if (balance > customer.balance) {
			return this;
		}
		return customer;
	}

	public int howMany() {
		return countCustomer;
	}
	
	public static int HeadCount() {
		return countCustomer;
	}
	// @Override
	// public String toString() {
	// return firstName + " " + lastName;
	// }

}
