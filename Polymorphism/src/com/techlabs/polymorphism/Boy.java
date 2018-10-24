package com.techlabs.polymorphism;

public class Boy implements IManable, IEmotional {

	@Override
	public void cry() {
		System.out.println("Boy crying");
	}

	@Override
	public void laugh() {
		System.out.println("Boy laughing");
	}

	@Override
	public void wish() {
		System.out.println("Boy's Wish");
	}

	@Override
	public void desire() {
		System.out.println("Boy's desire");
	}

}
