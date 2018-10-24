package com.techlab.mapforcomplex;

import java.util.HashMap;

public class Hashmap {

	HashMap<Integer, String> hashMap = new HashMap<>();

	public void add(int key, String value) {
		hashMap.put(key, value);
	}

	public void delete(int key) {
		hashMap.remove(key);
	}

	public void update(int key, String value) {
		hashMap.replace(key, value);
	}

	public HashMap<Integer, String> display() {
		return hashMap;
	}
}
