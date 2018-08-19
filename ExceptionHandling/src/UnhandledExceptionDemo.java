
public class UnhandledExceptionDemo {

	public static void main(String[] args) {

		int[] numbers = {1, 2, 3, 4, 5};
		
		System.out.println(numbers[1]);
		int number = numbers[10];
		
		System.out.println("End of main() method" + number);
	}

}
