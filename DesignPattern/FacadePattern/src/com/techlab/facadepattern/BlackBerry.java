package com.techlab.facadepattern;

public class BlackBerry implements MobileShop {

	@Override
	public void ModelNo() {
		System.out.println("Model No. of BlackBerry");
	}

	@Override
	public void price() {
		System.out.println("Price of BlackBerry");
	}

}
