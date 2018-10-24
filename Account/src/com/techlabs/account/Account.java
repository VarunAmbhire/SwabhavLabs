package com.techlabs.account;

public class Account {
	private static int id = 101;
	private int accountNo;
	private String name;
	private int balance;
	private static int countCustomer = 1;

	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;

		accountNo = id;
		id++;
	}

	public Account(String name) {
		this(name, 1000);
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void withdraw(int amount) throws InsufficientFundTransferException {
		if (this.balance - amount < 1000) {
			throw new InsufficientFundTransferException("Insufficient Balance to transfer.");
		}
		this.balance = this.balance - amount;

	}

	public void deposit(int amount) {
		this.balance = this.balance + amount;
	}

	public int totalNoOfCustomer() {
		return countCustomer;
	}

}
