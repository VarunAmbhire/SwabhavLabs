package com.techlab.facadepattern;

public class Samsung implements MobileShop {

	@Override
	public void ModelNo() {
		System.out.println("Model No. of Samsung");
	}

	@Override
	public void price() {
		System.out.println("Price of Samsung");
	}
}
