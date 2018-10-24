package com.techlab.OCPRefractorTest;

import com.techlab.OCPRefractor.FixedDepositRefractor;
import com.techlab.OCPRefractor.NewYear;

public class OCPRefractorTest {

	public static void main(String[] args) {
		
		
		FixedDepositRefractor fixedDepositRefractor = new FixedDepositRefractor("qwe", 6000, 2, new NewYear());

		System.out.println("Total Interest :"+fixedDepositRefractor.calculateInterest());
	}
}
