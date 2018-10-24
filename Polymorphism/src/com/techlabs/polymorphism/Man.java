package com.techlabs.polymorphism;

public class Man implements IManable {

	@Override
	public void wish() {
		System.out.println("Man's Wish");
	}

	@Override
	public void desire() {
		System.out.println("Man's desire");
	}

}
