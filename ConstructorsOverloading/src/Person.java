
public class Person 
{
	
	String firstName;
	String lastName;
	int age;
	char gender;
	
	Person(String fName, String lastName) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this(fName, lastName, 0, '\0');
//		System.out.println(firstName);
//		firstName = fName;
		this(fName, lastName, 0);
	}
	
	Person(String firstName, String lastName, int age)
	{
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.age = age;
//		this(firstName, lastName, age, '\0');
		this(firstName,  lastName, '\0');
	}
	
	Person(String firstName, String lastName, char gender)
	{
		this(firstName, lastName, 0, gender);
	}
	
	Person(String firstName, String lastName, int age, char gender)
	{
		if (gender == 'M') {
			this.firstName = "Mr." + firstName;
		} else if (gender == 'F') {
			this.firstName = "Mrs." + firstName;
		} else {
			this.firstName = firstName;
		}
		
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
	}

}
