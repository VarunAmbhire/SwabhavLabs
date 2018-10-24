package com.techlabs.polymorphism;

public class PolymorphismTest {

	public static void main(String[] args) {

		Boy boy = new Boy();
		Man man = new Man();

		atTheMovies(boy);
		// atTheMovies(man);
		atTheParty(boy);
		atTheParty(man);

	}

	static void atTheMovies(IEmotional emotional) {
		emotional.cry();
		emotional.laugh();
	}

	static void atTheParty(IManable manable) {
		manable.desire();
		manable.wish();
	}
}
