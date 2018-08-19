
public class Demo {

	public static void main(String[] args) {
		
		Person p1 = new Person("A", "B", 10);
		Person p2 = new Person("A1", "B", 10);
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));

	}

}
