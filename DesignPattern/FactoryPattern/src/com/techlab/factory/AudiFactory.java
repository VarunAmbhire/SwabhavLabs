package com.techlab.factory;

public class AudiFactory implements IAutoFactory {

	@Override
	public IAutoMobile make() {
		return new Audi();
	}

}
