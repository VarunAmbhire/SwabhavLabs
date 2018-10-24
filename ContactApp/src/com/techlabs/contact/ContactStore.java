package com.techlabs.contact;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ContactStore {

	String csvFile = "resource\\contact.csv";
	String line = " \n";
	String cvsSplitsBy = ", ";

	public void export(ArrayList<Contact> contact) throws Exception {
		ArrayList<Contact> addList = new ArrayList<>();
		FileWriter fileWriter = null;

		fileWriter = new FileWriter(csvFile, true);
		for (Contact contacts : contact) {
			fileWriter.append(String.valueOf(contacts.getID()));
			fileWriter.append(cvsSplitsBy);
			fileWriter.append(contacts.getName());
			fileWriter.append(cvsSplitsBy);
			fileWriter.append(contacts.getCompany());
			fileWriter.append('\n');
			addList.add(contacts);
		}

		// fileWriter.flush(); fileWriter.close();

	}

	public ArrayList<Contact> search(ArrayList<Contact> contacts, String word) {
		ArrayList<Contact> searchedContact = new ArrayList<>();
		for (Contact contact : contacts) {
			String name = contact.getName().toLowerCase();

			if (name.contains(word)) {
				searchedContact.add(contact);
			}

		}
		return searchedContact;
	}

	String file = "resource\\cont.txt";

	public void serialize(ArrayList<Contact> contacts) throws Exception {
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(contacts);
		fileOutputStream.close();
	}

	public ArrayList<Contact> deserialise() throws Exception {
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		ArrayList<Contact> contacts = (ArrayList<Contact>) objectInputStream.readObject();
		objectInputStream.close();
		return contacts;
	}
}
