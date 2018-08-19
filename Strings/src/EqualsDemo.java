
public class EqualsDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("A", "B", 20, 'F');
		Person p2 = new Person("A", "B", 20, 'F');
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		

	}

}
