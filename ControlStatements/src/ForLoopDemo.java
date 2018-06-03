
public class ForLoopDemo {

	public static void main(String[] args) {
		
		for (int x = 0; x < 10; x = x + 1)
		{
			//body of for loop
//			System.out.println("x = " + x);
		}
		
		
		//print all the elements of an array
		int scores[] = {30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
		System.out.println(scores);
		
		//using while loop to print the elements of an array
//		int index = 0;
//		while (index < scores.length) 
//		{
//			System.out.println(scores[index]);
//			index = index + 1;
//		}
		
		System.out.println("======= FOR LOOP OUTPUT ============");
		//using for loop to print the elements of an array
		for (int i = 0; i < scores.length; i++)
		{
			System.out.println(scores[i]);
		}
		System.out.println("===================");
		
//		while(x < 10)
//		{
//			
//		}
		
		int a = 0;
		while (a < 10)
		{
			//body of while loop
			a = a + 1;
		}
		
		//System.out.println(a);
		
		a = 0;
		while (a < 100)
		{
			
		}

	}

}
