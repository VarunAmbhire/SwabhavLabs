package com.techlab.setforcomplexdata;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashset {
	HashSet<Student> set = new HashSet<>();

	public void add(Student student) {
		set.add(student);
	}

	public StringBuilder display() {
		StringBuilder stringBuilder = new StringBuilder();
		for (Student student : set) {
			stringBuilder.append(student.getRollNso() + "\t");
			stringBuilder.append(student.getName() + "\t");
			stringBuilder.append(student.getCompany() + "\n");
		}
		return stringBuilder;
	}

	public void update(int rollNo, Student student) {
		ArrayList<Student> storedArray = new ArrayList<>();
		for (Student i : set) {
			storedArray.add(i);
		}
		storedArray.add(rollNo, student);
		for (Student i : storedArray) {
			set.add(i);
		}
	}

	public void delete(Student student) {
		set.remove(student);
	}

	public boolean search(String name) {
		boolean result = false;
		for (Student student : set) {
			if (name.equals(student.getName())) {
				result = true;
			}
		}
		return result;
	}
}
