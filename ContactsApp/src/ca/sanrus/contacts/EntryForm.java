package ca.sanrus.contacts;

import java.util.Scanner;

import ca.sanrus.contacts.exception.InvalidFormEntryException;
import ca.sanrus.contacts.pojo.Contact;

public interface EntryForm {
	
	Contact prompt(Scanner scanner) throws InvalidFormEntryException;

}
