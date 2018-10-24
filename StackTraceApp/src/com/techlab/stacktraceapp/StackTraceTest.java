package com.techlab.stacktraceapp;

public class StackTraceTest {

	public static void main(String[] args) {
		System.out.println("Insite main");
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End of main");
	}

	private static void m1() throws Exception {
		System.out.println("Insite m1.");
		m2();
		System.out.println("End of m1.");

	}

	private static void m2() throws Exception {
		System.out.println("Insite m2.");
		m3();
		System.out.println("End of m2.");

	}

	private static void m3() throws Exception {
		System.out.println("Insite m3.");
		throw new Exception("Error in M3");
//		System.out.println("End of m3");

	}
}
