package com.techlab.mapforcomplex;

public class MapTest {

	public static void main(String[] args) {

		Student student = new Student();
		Student student1 = new Student();
		Student student2 = new Student();

		student.setRollNumber(101);
		student.setName("asas");

		student1.setRollNumber(102);
		student1.setName("klj");

		student2.setRollNumber(103);
		student2.setName("lnmnm");

		Hashmap hashmap = new Hashmap();
		Llinkedhashmap liLlinkedhashmap = new Llinkedhashmap();
		Treemap treemap = new Treemap();

		hashmap.add(student.getRollNumber(), student.getName());
		hashmap.add(student1.getRollNumber(), student1.getName());
		hashmap.add(student2.getRollNumber(), student2.getName());

		liLlinkedhashmap.add(student.getRollNumber(), student.getName());
		liLlinkedhashmap.add(student1.getRollNumber(), student1.getName());
		liLlinkedhashmap.add(student2.getRollNumber(), student2.getName());

		treemap.add(student.getRollNumber(), student.getName());
		treemap.add(student1.getRollNumber(), student1.getName());
		treemap.add(student2.getRollNumber(), student2.getName());

		System.out.println(hashmap.display());
		System.err.println(liLlinkedhashmap.display());
		System.out.println(treemap.display());
		
		hashmap.update(102, "jkl");
		treemap.delete(101);
		System.out.println(hashmap.display());
		System.err.println(liLlinkedhashmap.display());
		System.out.println(treemap.display());
	}

}
