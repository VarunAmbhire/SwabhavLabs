package com.techlab.facadepattern;

public class FacadepatternClient {

	public static void main(String[] args) {
		ShopKeeper shopKeeper = new ShopKeeper();
		shopKeeper.blackBerrySale();
		
		shopKeeper.samsungSale();
	}

}
