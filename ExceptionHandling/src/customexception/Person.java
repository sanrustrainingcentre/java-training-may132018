package customexception;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	private char gender;
	
	public Person(String firstName, 
			String lastName,
			int age,
			char gender) throws FirstNameRequiredException, 
								LastNameRequiredException, 
								Exception {
		
		if (firstName != null 
				&& !"".equals(firstName.trim())) {
			this.firstName = firstName;
		} else {
			throw new FirstNameRequiredException("First Name is required.");
		}
		

		if (lastName != null 
				&& !"".equals(lastName.trim())) {
			this.lastName = lastName;
		} else {
			throw new LastNameRequiredException("Last Name is required.");
		}
		
		if (age >= 18) {
			this.age = age;
		} else {
			throw new Exception("Age must be greater than 18.");
		}
		
		if (gender == 'm' 
				|| gender == 'M' 
				|| gender == 'f' 
				|| gender == 'F') {
			this.gender = gender;			
		} else {
			throw new Exception("Gender must be either male or female.");
		}
		
		
	}

}
