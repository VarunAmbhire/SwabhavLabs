package com.techlab.guitar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FindInstrumentTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initilizeInvetory(inventory);

		Map properties = new HashMap();
		properties.put("builder", Builder.GIBSON);
		properties.put("backWood", Wood.MAPLE);
		InstrumentSpec clientSpec = new InstrumentSpec(properties);

		List matchingInstruments = inventory.search(clientSpec);
		if (!matchingInstruments.isEmpty()) {
			System.out.println("You might like this Instruments");
			for (Iterator iterator = matchingInstruments.iterator(); iterator.hasNext();) {
				Instrument instrument = (Instrument) iterator.next();
				InstrumentSpec spec = instrument.getSpec();
				System.out
						.println("We have " + spec.getProperty("instrumentType") + " with The following properties: ");
				for (Iterator i = spec.getProperties().keySet().iterator(); i.hasNext();) {
					String propertyName = (String) i.next();
					if (propertyName.equals("instrumentType"))
						continue;
					System.out.println(" " + propertyName + " " + spec.getProperty(propertyName));
				}
				System.out.println(" You can have this " + spec.getProperty("instrumentType") + " for $"
						+ instrument.getPrice() + "\n.");
			}
		} else {
			System.out.println("Instrument Not Found");
		}

		System.out.println("-----------------------------------");

	}

	private static void initilizeInvetory(Inventory inventory) {

		Map properties = new HashMap();
		properties.put("instrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.COLLINGS);
		properties.put("model", "CJ");
		properties.put("type", Type.ACOUSTIC);
		properties.put("numStrings", 12);
		properties.put("topWood", Wood.ALDER);
		properties.put("backWood", Wood.ALDER);
		inventory.addInstrument("V1232", 500, new InstrumentSpec(properties));

		properties.put("instrumentType", InstrumentType.BANJO);
		properties.put("builder", Builder.GIBSON);
		properties.put("model", "KL");
		properties.put("type", Type.ELECTRIC);
		properties.put("numStrings", 12);
		properties.put("topWood", Wood.ALDER);
		properties.put("backWood", Wood.MAPLE);
		inventory.addInstrument("V5232", 700, new InstrumentSpec(properties));
	}
}
