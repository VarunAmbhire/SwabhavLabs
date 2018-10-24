package com.techlab.strategypattern1;

public class GenerateBill {

	public static void main(String[] args) {
		GetPlanFactory getPlanFactory = new GetPlanFactory();
		Plan plan = getPlanFactory.getPlan(PlanType.DOMESTIC);

		System.out.println(plan.calculateBill(8));
	}
}
