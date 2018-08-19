
public class IfElseSelectionStatement {

	public static void main(String[] args) {
		
		/*
		 * 0 <= x <= 10, then print "small value" on the console
		 * 11 <= x <= 100, then print "medium value" on the console
		 * 101 <= x <= 10000, then print "large value" on the console
		 * x > 10000, then print "very large value" on the console
		 * 
		 * for all other 'x' values, print "Invalid data"
		 * 
		 */
		
		int x = 11;
		
		if (x <= 10) 
		{
			System.out.println("small value");
		}
		else if (x <= 100)
		{
			System.out.println("medium value");
		}
		else if (x <= 1000)
		{
			System.out.println("large value");
		}
		else if (x > 10000)
		{
			System.out.println("very large value");
		}
		else
		{
			System.out.println("Invalid data");
		}

	}

}
