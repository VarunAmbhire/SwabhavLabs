package com.techlab.mapforinteger;

public class MapTest {

	public static void main(String[] args) {

		LinkedhashMap linkedhashMap = new LinkedhashMap();
		Treemap treemap = new Treemap();
		Hashmap hashmap = new Hashmap();

		linkedhashMap.add(10, 1212);
		linkedhashMap.add(11, 456);
		linkedhashMap.add(12, 689);

		treemap.add(10, 1212);
		treemap.add(11, 456);
		treemap.add(12, 689);

		hashmap.add(10, 1212);
		hashmap.add(11, 456);
		hashmap.add(12, 689);

		System.out.println(linkedhashMap.display());
		System.out.println(treemap.display());
		System.out.println(hashmap.display());

		hashmap.update(11, 500);
		treemap.delete(11);
		
		System.out.println(treemap.display());
		System.out.println(hashmap.display());

		
	}

}
