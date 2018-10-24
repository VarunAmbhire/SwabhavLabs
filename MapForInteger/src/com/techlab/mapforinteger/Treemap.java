package com.techlab.mapforinteger;

import java.util.TreeMap;

public class Treemap {

	TreeMap<Integer, Integer> treeMap = new TreeMap<>();

	public void add(int key, int value) {
		treeMap.put(key, value);
	}

	public void delete(int key) {
		treeMap.remove(key);
	}

	public void update(int key, int value) {
		treeMap.replace(key, value);
	}

	public TreeMap<Integer, Integer> display() {
		return treeMap;
	}
}
