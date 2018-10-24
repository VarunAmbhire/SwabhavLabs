package com.techlab.setforinteger;

public class SetTest {

	public static void main(String[] args) {
		new SetTest().operation();
	}

	private void operation() {
		int value[] = { 12, 13, 42, 54, 87, 12, 9 };

		Hashset hashset = new Hashset();
		for (int num : value) {
			hashset.add(num);
		}
		hashset.search(42);
		System.out.println(hashset.display());
		hashset.update(2, 100);

		LinkedHashset linkedHashset = new LinkedHashset();
		for (int num : value) {
			linkedHashset.add(num);
		}
		linkedHashset.search(42);
		System.out.println(linkedHashset.display());
		linkedHashset.update(2, 100);

		Treeset treeset = new Treeset();
		for (int num : value) {
			treeset.add(num);
		}
		treeset.search(42);
		System.out.println(treeset.display());
		treeset.update(2, 100);
	}
}
