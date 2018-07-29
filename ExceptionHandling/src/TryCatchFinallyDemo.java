
public class TryCatchFinallyDemo {

	public static void main(String[] args) {

		int[] numbers = {1, 2, 3, 4, 5};
		
		System.out.println(numbers[1]);
		
		try {
			int number = numbers[10];	
			System.out.println("End of main() method" + number);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			//finally block will be executed even if exception occurred or not
			System.out.println("Finally block");
		}
		
		System.out.println("End of main() method.");
		
	}

}
