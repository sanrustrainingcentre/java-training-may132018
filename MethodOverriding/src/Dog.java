
public class Dog extends Animal {
	
	void eat()
	{
		System.out.println("Dog way of eating food.");
		super.eat();
	}
	
	void sleep()
	{
		System.out.println("Dog way of sleeping.");
	}
	
	void walk()
	{
		System.out.println("Dog way of walking.");
	}
	
	B getValue()
	{
		return new B();
	}

}
