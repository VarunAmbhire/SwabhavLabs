package com.techlabs.set.test;

import java.util.Scanner;

import com.techlab.set.SetOperation;

public class SetOpertaionTest {

	private static final int ADD = 1;
	private static final int DELETE = 2;
	private static final int DISPLAY = 3;
	private static final int SEARCH = 4;

	public static void main(String[] args) {
		new SetOpertaionTest().action();
	}

	private void action() {
		SetOperation setOperation = new SetOperation();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the option\n1:Add\n2:Remove\n3:Display\n4:Search");
			int key = scanner.nextInt();
			switch (key) {
			case ADD:
				int num = scanner.nextInt();
				setOperation.add(num);
				break;
			case DELETE:
				int num1 = scanner.nextInt();
				setOperation.delete(num1);
				break;
			case DISPLAY:
				System.out.println("HashSet       : "+setOperation.hashsetDiplay());
				System.out.println("LinkedListSet : "+setOperation.linkedsetDiplay());
				System.out.println("TressSet      : "+setOperation.treesetDiplay());
				break;
			case SEARCH:
				int num2 = scanner.nextInt();
				System.out.println(setOperation.search(num2));
				break;
			default:
				break;
			}
		}
	}
}
