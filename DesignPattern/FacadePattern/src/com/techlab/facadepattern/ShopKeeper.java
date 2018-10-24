package com.techlab.facadepattern;

public class ShopKeeper {

	public void iPhoneSale() {
		MobileShop iPhone = new IPhone();
		iPhone.ModelNo();
		iPhone.price();
	}

	public void samsungSale() {
		MobileShop samsung = new Samsung();
		samsung.ModelNo();
		samsung.price();
	}

	public void blackBerrySale() {
		MobileShop blackBerry = new BlackBerry();
		blackBerry.ModelNo();
		blackBerry.price();
	}
}
