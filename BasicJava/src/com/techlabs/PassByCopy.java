package com.techlabs;

public class PassByCopy {

	public static void main(String[] args) {
		int mark = 100;
		changeMarkToZero(mark);
		System.out.println(mark);

		int[] salary = { 1000, 2000, 2120 };
		changeSalaryToZero(salary);

		for (int i : salary) {
			System.out.println(i);
		}
	}

	private static void changeSalaryToZero(int[] salary) {
		for (int j = 0; j < salary.length; j++) {
			salary[j] = 0;
		}
	}

	private static void changeMarkToZero(int mark) {

		mark = 0;
	}

}
