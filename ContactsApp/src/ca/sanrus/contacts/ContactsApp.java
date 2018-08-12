package ca.sanrus.contacts;

import java.io.File;
import java.util.Scanner;

import ca.sanrus.contacts.exception.InvalidFormEntryException;
import ca.sanrus.contacts.pojo.Contact;

public class ContactsApp {
	
	private static final String ADD_CONTACT_INPUT_ENTRY = "1";
	private static final String EDIT_CONTACT_INPUT_ENTRY = "2";
	private static final String DELETE_CONTACT_INPUT_ENTRY = "3";
	private static final String SEARCH_CONTACT_INPUT_ENTRY = "4";
	private static final String EXIT = "5";
	private static final int MAX_NUMBER_OF_CONTACTS = 100;

	public static void main(String[] args) {
		
		File file = new File("files/contacts.csv");
		
		Contact[] contacts = new Contact[MAX_NUMBER_OF_CONTACTS];
		int topIndex = 0;
		
		Scanner scanner = new Scanner(System.in);
		String input = null;
		
		do {
			
			System.out.println("=========Contacts App============");
			System.out.println("1. Add Contact");
			System.out.println("2. Edit Contact");
			System.out.println("3. Delete Contact");
			System.out.println("4. Search Contacts");
			System.out.println("5. Exit");
			
			input = scanner.nextLine();
			EntryForm entryForm;
			
			if (input != null) {
				switch (input) {
					case ADD_CONTACT_INPUT_ENTRY:
						entryForm = new AddContactEntryForm();
						Contact contact;
						try {
							contact = entryForm.prompt(scanner);
							contacts[topIndex++] = contact;
							System.out.println("Added contact => " + contact);
						} catch (InvalidFormEntryException e) {
							System.out.println(e.getMessage());
						}
						break;
						
					case EDIT_CONTACT_INPUT_ENTRY:
						entryForm = new EditContactEntryForm(contacts);
						try {
							Contact editContact = entryForm.prompt(scanner);
							System.out.println("Updated contact => " + editContact);
						} catch (InvalidFormEntryException e) {
							e.printStackTrace();
						}
						break;
						
					case DELETE_CONTACT_INPUT_ENTRY:
						break;
					
					case SEARCH_CONTACT_INPUT_ENTRY:
						break;
						
					case EXIT:
						System.exit(0);
						break;
						
					default:
						System.out.println("Invalid entry");
						break;
				}
			}
			
		} while(input != null && !"".equals(input) && !EXIT.equals(input));

	}

}
