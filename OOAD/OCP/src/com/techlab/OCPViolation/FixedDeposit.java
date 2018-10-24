package com.techlab.OCPViolation;

public class FixedDeposit {

	private String name;
	private int principal;
	private int year;
	private FestivalType festival;

	public FixedDeposit(String name, int principal, int year, FestivalType festival) {
		this.name = name;
		this.principal = principal;
		this.year = year;
		this.festival = festival;
	}

	public int findRate() {
		if (this.festival.equals(festival.HOLI)) {
			return 8;
		} else if (this.festival.equals(festival.NEW_YEAR)) {
			return 9;
		} else {
			return 7;
		}
	}

	public float calculateInterest() {
		int total = principal * year * findRate();
		return (total / 100) ;
	}
}
