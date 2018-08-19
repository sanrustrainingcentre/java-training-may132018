
public class Person extends Object {
	
	private String firstName;
	private String lastName;
	private int age;
	private char gender;
	
	public Person(String firstName,
			String lastName,
			int age,
			char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName != null) {
			this.firstName = firstName;			
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	public String toString() {
		String prefix = "";
		if (gender == 'M' || gender == 'm') {
			prefix = "Mr.";
		} else if (gender == 'F' || gender == 'f') {
			prefix = "Ms.";
		}
		return (prefix + firstName + " " + lastName + " is " + age + " year(s) old.");
	}
	
	public boolean equals(Person that) {
		
		boolean isSamePersonObject = (that.firstName != null && that.firstName.equals(firstName)) 
										&& (that.lastName != null && that.lastName.equals(lastName))
										&& (that.age == age)
										&& (that.gender == gender);
		
        return isSamePersonObject;
    }
	
	

}
