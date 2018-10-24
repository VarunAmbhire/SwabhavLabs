package com.techlab.OCPRefractor;

public class FixedDepositRefractor {

	private String name;
	private int principal;
	private int year;
	private IFestival festival;

	public FixedDepositRefractor(String name, int principal, int year, IFestival festival) {
		super();
		this.name = name;
		this.principal = principal;
		this.year = year;
		this.festival = festival;
	}

	private int findRate() {
		return festival.getRate();
	}
	
	public float calculateInterest() {
		int total = principal * year * findRate();
		return (total / 100) ;
	}



	
}
