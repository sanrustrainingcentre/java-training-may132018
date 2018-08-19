
public class Math {
	
	
	public static int div(int x, int y) {
		
		try {
			return (x / y);
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero is not accepted by div() method.");
			return -1;
		}
		finally {
			System.out.println("Finally block in div(int x, int y");
		}
				
	}

}
