package com.techlab.guitar;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List inventory;

	public Inventory() {
		inventory = new LinkedList();
	}

	public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
		Instrument instrument = new Instrument(serialNumber, price, spec);
		inventory.add(instrument);
		Collections.sort(inventory);
	}

	public List<Instrument> allInstrument() {
		return inventory;
	}

	public Instrument getInstrument(String serialNumber) {
		for (Iterator iterator = inventory.iterator(); iterator.hasNext();) {
			Instrument instrument = (Instrument) iterator.next();
			if (instrument.getSerialNumber().equals(serialNumber)) {
				return instrument;
			}
		}
		return null;
	}

	public List search(InstrumentSpec searchInstrument) {
		List matchingInstrument = new LinkedList<>();
		for (Iterator i = inventory.iterator(); i.hasNext();) {
			Instrument instrument = (Instrument) i.next();
			if (instrument.getSpec().matches(searchInstrument))
				matchingInstrument.add(instrument);
		}
		return matchingInstrument;
	}

}
