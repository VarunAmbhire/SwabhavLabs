package com.techlab.mapforinteger;

import java.util.LinkedHashMap;

public class LinkedhashMap {

	java.util.LinkedHashMap<Integer, Integer> linkedHashMap = new java.util.LinkedHashMap<>();

	public void add(int key, int value) {
		linkedHashMap.put(key, value);
	}

	public void delete(int key) {
		linkedHashMap.remove(key);
	}

	public void update(int key, int value) {
		linkedHashMap.replace(key, value);
	}

	public LinkedHashMap<Integer, Integer> display() {
		return linkedHashMap;
	}
}
