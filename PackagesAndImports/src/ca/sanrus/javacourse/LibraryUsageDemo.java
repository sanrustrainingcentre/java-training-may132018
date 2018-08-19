package ca.sanrus.javacourse;


import com.google.gdrive.OpenDocument;

import ca.sanrus.customer.Customer;
import ca.sanrus.customer.Person;

public class LibraryUsageDemo {
	
	public static void main(String[] args) {
		OpenDocument googleDocument = new OpenDocument();
//		com.microsoft.onedrive.OpenDocument microsoftDocument = new com.microsoft.onedrive.OpenDocument();
		
		googleDocument.open();
//		microsoftDocument.open();
		
		Customer customer = new Customer();
		Person person = new Person();
	}
	
}