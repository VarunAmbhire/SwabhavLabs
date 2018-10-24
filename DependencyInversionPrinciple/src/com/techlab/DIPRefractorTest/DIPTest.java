package com.techlab.DIPRefractorTest;

import com.techlab.DIPViolation.LogType;
import com.techlab.DIPViolation.TaxCalculator;

public class DIPTest {

	public static void main(String[] args) {

		TaxCalculator taxCalculator = new TaxCalculator();
		taxCalculator.setLogType(LogType.EMAIL);

		taxCalculator.calculate(2500, 0);
	}

}
