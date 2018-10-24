package com.techlab.setforinteger;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Set;

public class Treeset {

	TreeSet<Integer> treeset = new TreeSet<>();

	public void add(int num) {
		treeset.add(num);
	}

	public void update(int index, int num) {
		ArrayList<Integer> storedArray = new ArrayList<>();
		for (int i : treeset) {
			storedArray.add(i);
		}
		storedArray.add(index, num);
		for (int i : storedArray) {
			treeset.add(i);
		}
	}

	public void delete(int num) {
		treeset.remove(num);
	}

	public TreeSet<Integer> display() {
		return treeset;
	}

	public String search(int num) {
		String result = "Result Not found";
		for (int i : treeset) {
			if (i == num) {
				result = "Result found";
			}
		}
		return result;
	}

}
