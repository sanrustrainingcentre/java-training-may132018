package demo;

public class BoxDemo {

	public static void main(String[] args) {
		
		Box b1 = new Box(10, 20, 30);
		System.out.println("Volume of B1 = " + b1.volume());
		
		b1.setHeight(-40);

	}

}
