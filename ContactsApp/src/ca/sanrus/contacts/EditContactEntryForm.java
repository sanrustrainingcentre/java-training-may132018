package ca.sanrus.contacts;

import java.util.Scanner;

import ca.sanrus.contacts.exception.InvalidFormEntryException;
import ca.sanrus.contacts.pojo.Contact;

public class EditContactEntryForm implements EntryForm {
	
	private Contact[] contacts;
	
	public EditContactEntryForm(Contact[] contacts) {
		this.contacts = contacts;
	}

	/* (non-Javadoc)
	 * @see ca.sanrus.contacts.EntryForm#prompt(java.util.Scanner)
	 */
	@Override
	public Contact prompt(Scanner scanner) throws InvalidFormEntryException {
		
		
		for (int index = 0; index < contacts.length; index++) {
			Contact contact = contacts[index];
			if (contact != null) {
				System.out.println((index + 1) + ") " + contacts[index]);
			}
		}
		
		System.out.print("Pick a contact to edit: ");
		int contactIndex = Integer.parseInt(scanner.nextLine());
		
		Contact editContact = contacts[contactIndex - 1];
		
		System.out.print("Edit First Name [Original Value = " + editContact.getFirstName() + "]: ");
		String firstName = scanner.nextLine();
		
		System.out.print("Edit Last Name [Original Value = " + editContact.getLastName() + "]: ");
		String lastName = scanner.nextLine();
		
		editContact.setFirstName(firstName);
		editContact.setLastName(lastName);
		
		
		return editContact;
	}
	
	

}
