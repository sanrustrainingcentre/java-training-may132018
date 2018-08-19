
public class Customer extends Person
{
	String customerId;
	
	Customer(String firstName, String lastName)
	{
//		super.firstName = firstName;
//		super.lastName = lastName;
		super(firstName, lastName);
	}
	
	Customer(String customerId) {
		this.customerId = customerId;
	}
	
	Customer(String firstName, String lastName, 
			int age, String customerId)
	{
		super(firstName, lastName, age);
		this.customerId = customerId;
	}
}
