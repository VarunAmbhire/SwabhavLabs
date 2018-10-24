package com.techlabs.contact.test;

import java.util.ArrayList;

import com.techlabs.contact.Contact;
import com.techlabs.contact.ContactStore;

public class ReadWriteTest {

	public static void main(String[] args) throws Exception {

		// Contact[] contacts = new Contact[4];
		ArrayList<Contact> contacts = new ArrayList<>();

		Contact contact = new Contact(1, "Varun", "Marine");
		Contact contact1 = new Contact(2, "Soap", "SAS");
		Contact contact2 = new Contact(3, "Price", "TF 4");

		contacts.add(contact);
		contacts.add(contact1);
		contacts.add(contact2);

		ContactStore contactStore = new ContactStore();
		contactStore.serialize(contacts);
		System.out.println(contactStore.deserialise());
//		System.out.println(contactStore.retrive());
		
		
	}
}