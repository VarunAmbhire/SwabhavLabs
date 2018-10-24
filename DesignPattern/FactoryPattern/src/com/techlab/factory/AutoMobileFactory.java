package com.techlab.factory;

public class AutoMobileFactory {
	private static AutoMobileFactory factory;

	private AutoMobileFactory() {
	}

	public static AutoMobileFactory getInstance() {
		if (factory == null) {

			factory = new AutoMobileFactory();
		}
		return factory;
	}

	public IAutoFactory make(AutoType type) {
		if (type == AutoType.AUDI)
			return new AudiFactory();
		else if (type == AutoType.BMW)
			return new BMWFactory();
		else if (type == AutoType.TOYOTA)
			return new ToyotaFactory();
		return null;
	}

}
