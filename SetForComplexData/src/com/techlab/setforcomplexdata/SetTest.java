package com.techlab.setforcomplexdata;

public class SetTest {

	public static void main(String[] args) {
		Student students[] = new Student[4];

		students[0] = new Student(11, "asaad", "taliban");
		students[1] = new Student(12, "soap", "sas");
		students[2] = new Student(13, "price", "tf");
		students[3] = new Student(14, "sandman", "delta");

		// Hashset
		Hashset hashset = new Hashset();
		for (Student student : students) {
			hashset.add(student);
		}

		hashset.delete(students[0]);
		System.out.println(hashset.display());
		searchRecord(hashset.search("soap"));

		// LinkedHashSet
		LinkedHashset linkedHashset = new LinkedHashset();
		for (Student student : students) {
			linkedHashset.add(student);
		}
		linkedHashset.delete(students[0]);
		System.out.println(linkedHashset.display());
		searchRecord(linkedHashset.search("soap"));

		// TreeSet
		Treeset treeset = new Treeset();
		for (Student student : students) {
			treeset.add(student);
		}
		treeset.delete(students[0]);
		System.out.println(treeset.display());
		searchRecord(treeset.search("1"));

	}

	static void searchRecord(Boolean value) {
		if (value) {
			System.out.println("Record Found");
		}else {
		System.out.println("Record Not Found");
		}
		}
}
