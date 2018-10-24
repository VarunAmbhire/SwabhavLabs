package com.techlab.strategypattern1;

public class GetPlanFactory {

	public Plan getPlan(PlanType planType) {
		if (planType.equals(PlanType.DOMESTIC))
			return new DomesticPlan();
		else if (planType.equals(PlanType.INSTITUTIONAL))
			return new InstitutionalPlan();
		else if (planType.equals(PlanType.COMMERCIAL))
			return new CommercialPlan();
		return null;
	}
}
