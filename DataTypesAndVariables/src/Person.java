
public class Person {
	
	String firstName;//firstName belongs to Object scope
	String lastName;
	
	
	String getFullName() {
		
		int x = 10;
		
		return firstName + " " + lastName;
	}
	
	
	void display(int y) {
		
		System.out.println(y);
		
		int x = 20;
		
		{
			firstName = "ABC";
			int z = x + 10;
		}
		
		System.out.println(x);
		System.out.println(z);
		
		x = x + 1;
	}

}
