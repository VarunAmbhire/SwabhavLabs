package com.techlab.facadepattern;

public class IPhone implements MobileShop {

	@Override
	public void ModelNo() {
		System.out.println("Model No. of IPhone");
	}

	@Override
	public void price() {
		System.out.println("Price of IPhone");
	}

}
