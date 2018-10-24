package com.techlab.factory;

public class ToyotaFactory implements IAutoFactory {

	@Override
	public IAutoMobile make() {
		return new Toyota();
	}

}
