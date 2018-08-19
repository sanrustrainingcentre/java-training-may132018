
public class TwoDimensionalArrayDemo {

	public static void main(String[] args) {
		
		int marks[][];
		marks = new int[60][5];
		
		marks[0][0] = 95;
		System.out.println(marks[0][0]);
		
		//jagged array
		int marks1[][] = 
			{
					{1, 2, 3},
					{4, 5, 6},
					{7, 8, 9, 10, 11}
					
			};
		
		//marks1[1][4] = 50;
		int newMarks[] = {10, 20, 30, 40, 50, 60, 70};
		
		int marks2[][] = new int[][] {
									{1, 2, 3},
									{4, 5, 6},
									{7, 8, 9, 10, 11}
			
									};
	    marks2[1] = newMarks;
	    System.out.println(marks2[1][0]);
	    System.out.println(marks2[1][1]);
	    System.out.println(marks2[1][2]);
	    System.out.println(marks2[1][3]);
	    System.out.println(marks2[1][4]);
	    System.out.println(marks2[1][5]);
	    
	    System.out.println("No.of.rows => " + marks2.length);
	    System.out.println("No.of columns for 2nd row => " + marks2[1].length);
									

									
		
		

	}

}
