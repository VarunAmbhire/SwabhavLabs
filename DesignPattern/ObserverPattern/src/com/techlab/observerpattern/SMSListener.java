package com.techlab.observerpattern;

public class SMSListener implements IAccountListener {

	@Override
	public void balanceChanged(Account account) {
		System.out.println(account.getAccountNumber() + " has current Balance is " + account.getBalance()
				+ " message send from SMS");
	}

}
