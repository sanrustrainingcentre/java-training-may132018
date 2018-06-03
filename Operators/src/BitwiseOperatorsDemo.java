
public class BitwiseOperatorsDemo {

	public static void main(String[] args) {
		
		int x = 20;
		
		int a = 10;
		int b = 3;
		
		int c = a & b;
		
		/*
		 * a => 1010
		 * b => 0011
		 * c => 0010 => 2 in decimal
		 * 
		 */
		
		System.out.println(c);
		System.out.println(Integer.toBinaryString(c));
		
		//shift right operator
		//shifting the bits right 2 times
		int y = x >> 2;
		System.out.println(Integer.toBinaryString(y));
		
		//shift right zero fill operator
		int z = -2 >>> 2;
		System.out.println(Integer.toBinaryString(-2));
		System.out.println(Integer.toBinaryString(z));

	}

}
