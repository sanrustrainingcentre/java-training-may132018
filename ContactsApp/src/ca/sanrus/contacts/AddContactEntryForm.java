package ca.sanrus.contacts;

import java.util.Scanner;

import ca.sanrus.contacts.exception.InvalidFormEntryException;
import ca.sanrus.contacts.pojo.Contact;

public class AddContactEntryForm implements EntryForm {
	
	
	public Contact prompt(Scanner scanner) throws InvalidFormEntryException {
		Contact contact;
		System.out.println("==========Add Contact Form========");
		
		System.out.print("First Name:");
		String firstName = scanner.nextLine();
		
		System.out.print("Last Name:");
		String lastName = scanner.nextLine();
		
		System.out.print("Email:");
		String email = scanner.nextLine();
		
		if (firstName == null || "".equals(firstName)) {
			throw new InvalidFormEntryException("First Name is required.");
		}
		
		contact = new Contact(firstName, lastName);
		contact.setEmail(email);
		
		
		return contact;
		
	}

}
