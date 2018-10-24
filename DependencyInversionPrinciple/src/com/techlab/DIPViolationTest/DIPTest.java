package com.techlab.DIPViolationTest;

import com.techlab.DIPViolation.LogType;
import com.techlab.DIPViolation.TaxCalculator;

public class DIPTest {

	public static void main(String[] args) {
		TaxCalculator taxCalculator = new TaxCalculator();
		taxCalculator.setLogType(LogType.XML);

		taxCalculator.calculate(2500, 0);
	}
}
