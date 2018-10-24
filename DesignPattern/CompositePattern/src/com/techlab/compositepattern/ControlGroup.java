package com.techlab.compositepattern;

import java.util.ArrayList;

public class ControlGroup implements IHTMLTag {
	private static int tabCounter = 0;
	private int reverseCounter = 0;
	private ArrayList<IHTMLTag> childrenTag;
	private String name;

	public ControlGroup(String name) {
		this.name = name;
		this.childrenTag = new ArrayList<>();
	}

	public void addChildrenTag(IHTMLTag tag) {
		childrenTag.add(tag);
	}

	@Override
	public String getTagName() {
		return name;
	}

	@Override
	public void generateHtml() {
		for (IHTMLTag tag : childrenTag) {
			indentation();
			System.out.print("<" + tag.getTagName() + ">\n");
			tag.generateHtml();
			reverseIndentation();
			System.out.println("</" + tag.getTagName() + ">");
		}
	}

	private void indentation() {
		tabCounter++;
		for (int i = 0; i < tabCounter; i++) {
			System.out.print("    ");
			reverseCounter = tabCounter;
		}
	}

	private void reverseIndentation() {
		for (int i = reverseCounter; i > 0; i--) {
			System.out.print("    ");

		}
	}
}
