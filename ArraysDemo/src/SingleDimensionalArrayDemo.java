
public class SingleDimensionalArrayDemo {

	public static void main(String[] args) {
		
		//1st way of creating an array
		int marks[];//array declaration
		marks = new int[5];//we are creating a table of 1 row and 5 columns.
		
		System.out.println("Length of marks array is:- " + marks.length);
		
		System.out.println(marks[0]);
		marks[-1] = 92;
		
		boolean values[] = new boolean[3];
		System.out.println(values[0]);
		
		String words[] = new String[10];
		words[0] = "aksjdh alskdf lakjshd";
		
		System.out.println(words[1]);
		
		//2nd way of creating an array
		int marks1[] = {80, 90, 92, 77, 80};
		System.out.println(marks1[1]);
		
		//3rd way of creating an array
		int marks2[] = new int[] {90, 80, 70, 85, 82};
	

	}

}
