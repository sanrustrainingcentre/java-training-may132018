
public class BoxDemo {
	
	public static void main(String[] args) {
		
		Box b1 = new Box();
		b1.length = 10;
		
		Box b2 = b1;
		b2.length = 50;
		
		System.out.println("b1.length = " + b1.length);
		System.out.println("b2.length = " + b2.length);
		
		b1.width = -20;
		b1.displayVolume();
	}

}
