package com.techlab.decoratorpatterntest;

import com.techlab.decoratorpattern.ChineaseFood;
import com.techlab.decoratorpattern.Food;
import com.techlab.decoratorpattern.NonVegFood;
import com.techlab.decoratorpattern.VegFood;

public class Test {

	public static void main(String[] args) {

		Food nonVegFood = new NonVegFood(new VegFood());
		System.out.println(nonVegFood.preparedFood()+" of price "+nonVegFood.foodPrice());

		Food chineaseFood =new ChineaseFood(new NonVegFood(new VegFood()));
		System.out.println(chineaseFood.preparedFood()+" of price "+chineaseFood.foodPrice());
	}

}
