package com.techlab.setforinteger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {

	LinkedHashSet<Integer> linkedset = new LinkedHashSet<>();

	public void add(int num) {
		linkedset.add(num);
	}

	public void update(int index, int num) {
		ArrayList<Integer> storedArray = new ArrayList<>();
		for (int i : linkedset) {
			storedArray.add(i);
		}
		storedArray.add(index, num);
		for (int i : storedArray) {
			linkedset.add(i);
		}
	}

	public void delete(int num) {
		linkedset.remove(num);
	}

	public LinkedHashSet<Integer> display() {
		return linkedset;
	}

	public String search(int num) {
		String result = "Result Not found";
		for (int i : linkedset) {
			if (i == num) {
				result = "Result found";
			}
		}
		return result;
	}

}
