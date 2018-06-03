
public class SwitchStatementDemo {

	public static void main(String[] args) {
		
		int x = 5;
		
		//switch statement for integers.
		switch (x)
		{
			default:
				System.out.println("Invalid values of x");
				break;
			
			case 4:
				System.out.println("x is 4");
				break;
				
			case 0:
			case 1:
			case 2:
			case 3:
				System.out.println("x is 0, 1, 2 and 3");
				break;
			
		}
		
		if (x == 0 || x == 1 || x == 2 || x == 3)
		{
			System.out.println("x is 0, 1, 2 and 3");
		} 
		else if (x == 4) 
		{
			System.out.println("x is 4");
		}
		else
		{
			System.out.println("Invalid values of x");
		}
		
		
		//switch statement for string values
		String str = "ABC";
		
		switch(str)
		{
			case "ABC":
				break;
				
			case "DEF":
				break;
				
			case "GHI":
				break;
			
			default:
				
		}
		
		//equivalent if statement for 'switch'
		
		if (str.equals("ABC")) 
		{
			
		}
		else if (str.equals("DEF"))
		{
			
		}
		else if (str.equals("GHI"))
		{
			
		}
		else 
		{
			
		}
		

	}

}
