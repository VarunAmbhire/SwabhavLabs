package com.techlab.factory;

public class BMWFactory implements IAutoFactory {

	@Override
	public IAutoMobile make() {
		return new BMW();
	}

}
