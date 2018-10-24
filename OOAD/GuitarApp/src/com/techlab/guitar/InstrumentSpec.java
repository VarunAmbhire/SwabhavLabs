package com.techlab.guitar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InstrumentSpec {

	private Map properties;

	public InstrumentSpec(Map properties) {
		if (properties == null) {
			this.properties = new HashMap();
		} else {
			this.properties = new HashMap(properties);
		}
	}

	public Object getProperty(String propertyName) {
		return properties.get(propertyName);
	}

	public Map getProperties() {
		return properties;
	}

	public boolean matches(InstrumentSpec spec) {
		for (Iterator iterator = spec.getProperties().keySet().iterator(); iterator.hasNext();) {
			String propertyName = (String) iterator.next();
			if (!properties.get(propertyName).equals(spec.getProperty(propertyName)))
				return false;
		}
		return true;
	}

}
