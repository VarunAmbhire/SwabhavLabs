package com.techlab.compositepattern;

public class Control implements IHTMLTag {
	private String tagName;

	public Control(String tagName) {
		this.tagName = tagName;
	}

	@Override
	public String getTagName() {
		return tagName;
	}

	@Override
	public void generateHtml() {
	};

}
