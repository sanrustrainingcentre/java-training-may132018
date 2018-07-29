package customexception;

public class Demo {

	public static void main(String[] args) {
		
		String firstName = "ABC";
		String lastName = "DEF";
		int age = 19;
		char gender = 'A';
		
		try {
			Person p1 = new Person(firstName, lastName, age, gender);
			System.out.println(p1);
		} catch (FirstNameRequiredException e) {
			System.out.println(e.getMessage());
		} catch (LastNameRequiredException e) {
			
		} catch (Exception e) {
			
		}

	}

}
