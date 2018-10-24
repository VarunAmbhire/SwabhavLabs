package com.techlab.mapforcomplex;

import java.util.LinkedHashMap;

public class Llinkedhashmap {
	LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

	public void add(int key, String value) {
		linkedHashMap.put(key, value);
	}

	public void delete(int key) {
		linkedHashMap.remove(key);
	}

	public void update(int key, String value) {
		linkedHashMap.replace(key, value);
	}

	public LinkedHashMap<Integer, String> display() {
		return linkedHashMap;
	}
}
