
public class Customer extends Person {
	
	String customerId;
	
//	Customer() {
//		super(null, null, 0, '\0');//=> Inserted by Java compiler to reach super class' constructor
//		System.out.println("Customer() default constructor is called");
//	}
	
	Customer(String firstName, String lastName, int age, char gender, String customerId) {
		super(firstName, lastName, age, gender);
		this.customerId = customerId;
	}
	
//	Customer(int age) {
//		this();
//	}

	
}
