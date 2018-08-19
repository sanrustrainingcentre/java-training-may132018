
public class MathDemo {

	public static void main(String[] args) {
		
		Math math = new Math();
		
		double result = math.add(10.5,  1);
		System.out.println("result = " + result);
		
		double z = math.add(1, 2.5);
		System.out.println("z = " + z);
		
		byte a = 3;
		byte b = 4;
		int c = math.add(a,  10);
		System.out.println("c = " + c);

	}

}
