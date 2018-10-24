package com.techlab.mapforinteger;

import java.util.HashMap;

public class Hashmap {

	HashMap<Integer, Integer> hashMap = new HashMap<>();

	public void add(int key, int value) {
		hashMap.put(key, value);
	}

	public void delete(int key) {
		hashMap.remove(key);
	}

	public void update(int key, int value) {
		hashMap.replace(key, value);
	}

	public HashMap<Integer, Integer> display() {
		return hashMap;
	}
}
