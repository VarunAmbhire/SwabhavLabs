package com.techlab.mapforcomplex;

import java.util.TreeMap;

public class Treemap {

	TreeMap<Integer, String> treeMap = new TreeMap<>();

	public void add(int key, String value) {
		treeMap.put(key, value);
	}

	public void delete(int key) {
		treeMap.remove(key);
	}

	public void update(int key, String value) {
		treeMap.replace(key, value);
	}

	public TreeMap<Integer, String> display() {
		return treeMap;
	}

}
