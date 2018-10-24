package com.techlab.strategyTest;

import com.techlab.strategy.Context;
import com.techlab.strategy.DoAddition;
import com.techlab.strategy.DoMultiplication;
import com.techlab.strategy.DoSubtraction;

public class Test {

	
	public static void main(String[] args) {
		Context contextAdditon=new Context(new DoAddition());
		Context contextMultiplication=new Context(new DoMultiplication());
		Context contextSubtraction=new Context(new DoSubtraction());
		
		System.out.println(contextAdditon.executeStrategy(12, 15));
		System.out.println(contextMultiplication.executeStrategy(12, 15));
		System.out.println(contextSubtraction.executeStrategy(12, 15));
	}
}
