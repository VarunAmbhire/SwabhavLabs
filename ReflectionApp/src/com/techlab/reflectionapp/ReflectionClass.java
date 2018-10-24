package com.techlab.reflectionapp;

import java.lang.reflect.Method;

public class ReflectionClass {

	Class clss;

	public ReflectionClass(Class clss) {
		super();
		this.clss = clss;
	}

	public int methodCounter() {
		Method[] methods = clss.getMethods();
		return methods.length;
	}

	public int constructorCounter() {
		return clss.getConstructors().length;
	}

	public int getterCounter() {
		int getter = 0;
		for (Method method : clss.getMethods()) {
			if (isGetter(method)) {
				getter++;
			}
		}
		return getter;
	}

	public int setterCounter() {
		int setter = 0;
		for (Method method : clss.getMethods()) {
			if (isSetter(method)) {
				setter++;
			}
		}
		return setter;
	}

	private boolean isGetter(Method method) {
		if (method.getName().startsWith("get")) {
			return true;
		}
		return false;
	}

	private boolean isSetter(Method method) {
		if (method.getName().startsWith("set")) {
			return true;
		}
		return false;
	}

}
