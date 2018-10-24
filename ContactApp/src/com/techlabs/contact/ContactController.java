package com.techlabs.contact;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ContactController {
	private static final int ADD_OPTION = 1;
	private static final int DISPLAY_OPTION = 2;
	private static final int SEARCH = 3;
	private static final int EXPORT = 4;
	private static final int EXIT = 5;

	ContactStore contactStore = new ContactStore();
	ArrayList<Contact> contacts = new ArrayList<>();

	public static void main(String[] args) throws Exception {

		ContactController contactController = new ContactController();
		contactController.startMenu();

	}

	private void startMenu() throws Exception {

//		contacts.addAll(0, contactStore.deserialise());
		contacts=contactStore.deserialise();

		Scanner scanner;
		String message = "Menu:\n1:Add\n2:Display:\n3:Search\n4:Export\n5:Exit \n" + "Select the option";
		int option = 0;

		do {
			scanner = new Scanner(System.in);
			System.out.println(message);
			option = scanner.nextInt();
			switch (option) {
			case ADD_OPTION:
				addNew();
				break;
			case DISPLAY_OPTION:
				System.out.println("ID\t\tName\tCompany");
				for (Contact contact : contacts) {
					System.out.print(contact.getID() + "\t");
					System.out.print(contact.getName() + "\t");
					System.out.println(contact.getCompany());
				}
				break;
			case SEARCH:
				searchWord();
				break;
			case EXPORT:
				export();
				break;
			case EXIT:
				contactStore.serialize(contacts);
				System.exit(0);
				break;
			default:
				break;
			}
		} while (true);

	}

	private void searchWord() {
		System.out.println("Search word : ");
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		if (contactStore.search(contacts, word).isEmpty()) {
			System.out.println("No Record Found");
		}
		System.out.println(contactStore.search(contacts, word));
	}

	private void addNew() throws Exception {
		Scanner scanner = new Scanner(System.in);
		Date date = new Date();
		int id = (int) date.getTime();
		System.out.println("Id : " + id);
		System.out.println("Enter Name : ");
		String name = scanner.nextLine();
		System.out.println("Enter company : ");
		String company = scanner.nextLine();

		Contact contact = new Contact(id, name, company);
		contacts.add(contact);

	}

	private void export() throws Exception {
		contactStore.export(contacts);
	}
}
