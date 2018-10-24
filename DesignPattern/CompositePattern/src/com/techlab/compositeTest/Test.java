package com.techlab.compositeTest;

import com.techlab.compositepattern.Control;
import com.techlab.compositepattern.ControlGroup;

public class Test {

	public static void main(String[] args) {
		ControlGroup html = new ControlGroup("HTML");
		ControlGroup body = new ControlGroup("Body");
		ControlGroup div = new ControlGroup("Div");
		Control p = new Control("p");
		Control text=new Control("Text");

		html.addChildrenTag(body);
		body.addChildrenTag(div);
		div.addChildrenTag(p);
		div.addChildrenTag(text);

		html.generateHtml();
	}
}
