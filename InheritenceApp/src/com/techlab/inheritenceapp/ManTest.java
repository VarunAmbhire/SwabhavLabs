package com.techlab.inheritenceapp;

public class ManTest {

	public static void main(String[] args) {
		Boy boy = new Boy();
		Infants infants = new Infants();
		Kid kid = new Kid();
		Man man = new Man();
		
		Man x=new Boy();

//		caseStudy(boy, infants, kid, man);
		
		playGround(x);
	}

	private static void caseStudy(Boy boy, Infants infants, Kid kid, Man man) {
		playGround(boy);
		playGround(infants);
		playGround(kid);
		playGround(man);
	}

	static void playGround(Man man) {
		man.read();
		man.play();
		man.walk();
	}
}
