package com.techlab.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOperation {

	Set<Integer> hashset = new HashSet<Integer>();
	LinkedHashSet<Integer> linkedset = new LinkedHashSet<>();
	TreeSet<Integer> treeset = new TreeSet<>();

	public void add(int num) {
		hashset.add(num);
		linkedset.add(num);
		treeset.add(num);
	}

	public void delete(int num) {
		hashset.remove(num);
		linkedset.remove(num);
		treeset.remove(num);
	}

	public Set<Integer> hashsetDiplay() {
		return hashset;
	}

	public LinkedHashSet<Integer> linkedsetDiplay() {
		return linkedset;
	}

	public TreeSet<Integer> treesetDiplay() {
		return treeset;
	}

	public Set<Integer> search(int num) {
		Set<Integer> searchList = new HashSet<>();
		for (int i : hashset) {
			if (i == num) {
				searchList.add(i);
			}
		}
		return searchList;
	}

}
