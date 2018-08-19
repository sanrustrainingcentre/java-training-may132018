
public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		System.out.println("Generic Animal behaviors");
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		animal.walk();
		
		System.out.println("-----------\n\n\n");
		
		System.out.println("Dog behaviors");
		Dog dog = new Dog();
		dog.eat();
		dog.sleep();
		dog.walk();
		
		System.out.println("-----------\n\n\n");
		System.out.println("Labrador Dog behaviors");
		LabradorDog labradorDog = new LabradorDog();
		labradorDog.eat();
		
		
//		A a1 = new A();
//		B b1 = new B();
//		C c1 = new C();
//		
//		A a2 = new C();
//		B b2 = new C();
		
		A a1 = animal.getValue(); 
		A a2 = dog.getValue();
		
		a1.methodA();
		a2.methodA();

	}

}
