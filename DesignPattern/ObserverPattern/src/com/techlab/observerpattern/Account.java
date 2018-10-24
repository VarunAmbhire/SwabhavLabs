package com.techlab.observerpattern;

import java.util.ArrayList;

public class Account {
	private int accountNumber;
	private String name;
	private int balance;
	private ArrayList<IAccountListener> listeners;

	public Account() {
		this.listeners = new ArrayList<>();
	}

	public void deposit(int amount) {
		this.balance = balance + amount;
		update();
	}

	public void withdraw(int amount) {
		this.balance = balance - amount;
		update();
	}

	public void update() {
		for (IAccountListener iAccountListener : listeners) {
			iAccountListener.balanceChanged(this);
		}

	}

	public void addListener(IAccountListener accountListener) {
		listeners.add(accountListener);
	}

	public void removeListner(IAccountListener accountListener) {
		int index = listeners.indexOf(accountListener);
		listeners.remove(index);
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}
}
