package com.techlabs;

public class FirstSecondLarge {

	public static void main(String[] args) {

		int nums[] = { 12, 32, 123, 34, 1, 64, 76, 343, 450, 544, 56 };
		int maximum = 0;
		int secondMaximum = 0;

		for (int index = 0; index < nums.length; index++) {

			if (nums[index] > maximum) {
				secondMaximum = maximum;
				maximum = nums[index];

			} else if (nums[index] > secondMaximum && nums[index] < maximum) {
				secondMaximum = nums[index];
			} else {

			}
		}

		System.out.println(maximum + " " + secondMaximum);

	}
}
