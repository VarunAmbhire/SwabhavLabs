package com.techlabs;

public class OddEven {

	public static void main(String[] args) {

		int num = 20;

		System.out.print("odd=");
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {

				System.out.print(i + ",");
			}
		}
		System.out.println("");
		System.out.print("even=");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.print(i + ",");
			}
		}

	}
}
