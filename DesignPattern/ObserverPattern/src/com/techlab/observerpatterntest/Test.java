package com.techlab.observerpatterntest;

import com.techlab.observerpattern.Account;
import com.techlab.observerpattern.EmailListener;
import com.techlab.observerpattern.IAccountListener;
import com.techlab.observerpattern.SMSListener;

public class Test {

	public static void main(String[] args) {
		IAccountListener emailListener = new EmailListener();
		IAccountListener smsListener = new SMSListener();

		Account account = new Account();
		account.addListener(emailListener);
		account.addListener(smsListener);
		
		account.setAccountNumber(123);
		account.setName("asas");
		account.setBalance(5000);
		Account account2 = new Account();

		account.withdraw(50);
		// account2.deposit(20);

	}
}
