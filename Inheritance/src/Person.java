
public class Person 
{
	
	String firstName;
	String lastName;
	int age;
	char gender;
	
	Person()
	{
		
	}
	
	Person(String firstName, String lastName) {
//		this.firstName = firstName;
//		this.lastName = lastName;
		this(firstName, lastName, 0, '\0');
	}
	
	Person(String firstName, String lastName, int age) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.age = age;
		this(firstName, lastName, age, '\0');
	}
	
	Person(String firstName, String lastName, int age, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
	}

}
