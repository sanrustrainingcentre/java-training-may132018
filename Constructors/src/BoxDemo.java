
public class BoxDemo {

	public static void main(String[] args) {

		//this will call Box(double length, double width, double height)
		Box b1 = new Box(2, 3.5, 4);
		System.out.println(b1.volume());
		
		//this will call Box(Box b) constructor
		Box b2 = new Box(b1);
		
		//constructor cannot be invoked without using "new" operator
		//compile error!
		//b2.Box();
		
		
		System.out.println(b2.volume());
	
		Box b3 = new Box();
		
	}

}
