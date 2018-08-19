
public class StaticKeywordDemo {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(10);
		System.out.println("Count after c1 => " + c1.getCount());
		
		Circle c2 = new Circle(20);
		System.out.println("Count after c2 => " + c2.getCount());
		
		
		Circle c3 = new Circle(30);
		Circle c4 = new Circle(40);
		Circle c5 = new Circle(50);
		Circle c6 = new Circle(60);
		
		System.out.println("Count after c6 => " + c6.getCount());
		
		System.out.println(c1.area());

	}

}
