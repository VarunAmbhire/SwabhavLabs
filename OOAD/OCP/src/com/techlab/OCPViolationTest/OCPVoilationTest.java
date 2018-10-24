package com.techlab.OCPViolationTest;

import com.techlab.OCPViolation.FestivalType;
import com.techlab.OCPViolation.FixedDeposit;

public class OCPVoilationTest {

	public static void main(String[] args) {
		FixedDeposit fixedDeposit = new FixedDeposit("sa", 2500, 2, FestivalType.NEW_YEAR);

		System.out.println("Total Interest :" + fixedDeposit.calculateInterest());
	}
}
