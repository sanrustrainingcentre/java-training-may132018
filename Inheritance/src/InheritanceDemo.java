
public class InheritanceDemo {

	public static void main(String[] args) {
		
		A a1 = new A();
		a1.x = 25;
		a1.methodA();
		
		B b1 = new B();
		b1.j = 30;
		b1.x = 50;
		b1.methodA();
		
		System.out.println(a1.x);
		System.out.println(b1.x);
		
		//using 'instanceof' operator
		boolean isAInstanceOfObject = a1 instanceof Object;
		boolean isBInstanceOfA = b1 instanceof A;
		
		System.out.println("(a1 instanceof Object) => " + isAInstanceOfObject);
		System.out.println("(b1 instanceof A) => " + isBInstanceOfA);
		
		B b2 = new B();
		b2.methodB();

	}

}
