package com.techlabs.account;

public class InsufficientFundTransferException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientFundTransferException(String message) {
		super(message);
	}
}
