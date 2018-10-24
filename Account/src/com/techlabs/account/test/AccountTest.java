package com.techlabs.account.test;

import com.techlabs.account.Account;
import com.techlabs.account.InsufficientFundTransferException;

public class AccountTest {

	public static void main(String[] args) throws InsufficientFundTransferException {
		Account account = new Account("Dell", 10000);
		Account acc = new Account("HP");
		Account a = new Account("sa");

		// account.setBalance(4000000);
		account.deposit(100);

		System.out.println(account.getAccountNo());
		System.out.println(acc.getAccountNo());
		System.out.println(a.getAccountNo());
		System.out.println(acc.getAccountNo());

		System.out.println("Balance After Deposit = " + account.getBalance());

		account.withdraw(900);
		System.out.println("Balance after Withdrawal = " + account.getBalance());

	}
}
