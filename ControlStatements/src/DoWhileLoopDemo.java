import java.util.Scanner;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String x;
		
		do 
		{
			System.out.println("1. Bagel");
			System.out.println("2. Coffee");
			System.out.println("3. French Vanilla");
			System.out.println("4. Breakfast");
			System.out.println("Press 'x' to exit.");
			
			System.out.print("Input your selection >>> ");
			x = scanner.next();
			
			switch(x)
			{
				case "1":
					System.out.println("Added bagel into the order. Wait time = 2 mins.");
					break;
					
				case "2":
					System.out.println("Added coffee into the order. Wait time = 1 min.");
					break;
					
				case "3":
					System.out.println("Added french vanilla into the order. Wait time = 1 min.");
					break;
				
				case "4":
					System.out.println("Added breakfast into the order. Wait time = 3 mins");
					break;
					
				default:
					if (!x.equalsIgnoreCase("x")) {
						System.out.println("Invalid selection. Please try again.");					
					}
					
//					System.out.println("Invalid selection. Please try again.");	
			}
			
		}
		while(!x.equalsIgnoreCase("x"));

	}

}
