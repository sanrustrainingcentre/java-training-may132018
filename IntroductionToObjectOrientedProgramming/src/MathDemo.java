
public class MathDemo {

	public static void main(String[] args) {

		Math mathObject = new Math();
		byte sumOf2And3 = (byte) mathObject.add(2,  3);
		System.out.println(mathObject.add(2,  3));
		
		mathObject.display();
		
		Box b1 = new Box();
		b1.length = 10;
		b1.width = 5;
		b1.depth = 2;
		
		double volumeOfB1Object = mathObject.volumeOfBox(b1);
		System.out.println(volumeOfB1Object);
		
	}

}
