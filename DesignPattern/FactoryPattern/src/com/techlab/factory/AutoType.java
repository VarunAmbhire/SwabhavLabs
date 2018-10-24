package com.techlab.factory;

public enum AutoType {

	AUDI, BMW, TOYOTA;

	@Override
	public String toString() {
		switch (this) {
		case AUDI:
			return "Audi";
		case BMW:
			return "BMW";
		case TOYOTA:
			return "Toyota";
		default:
			return null;
		}
	}
}
