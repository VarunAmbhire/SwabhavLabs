package com.techlab.setforinteger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Hashset {
	Set<Integer> hashset = new HashSet<Integer>();

	public void add(int num) {
		hashset.add(num);
	}

	public void update(int index, int num) {
		ArrayList<Integer> storedArray = new ArrayList<>();
		for (int i : hashset) {
			storedArray.add(i);
		}
		storedArray.add(index, num);
		for (int i : storedArray) {
			hashset.add(i);
		}
	}

	public void delete(int num) {
		hashset.remove(num);
	}

	public Set<Integer> display() {
		return hashset;
	}

	public String search(int num) {
		String result = "Result Not found";
		for (int i : hashset) {
			if (i == num) {
				result = "Result found";
			}
		}
		return result;
	}

}
