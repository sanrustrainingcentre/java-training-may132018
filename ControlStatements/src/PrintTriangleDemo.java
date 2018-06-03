
public class PrintTriangleDemo {

	public static void main(String[] args) {
		
		int depth = 4;
		
		for (int rowCount = 1; rowCount <= depth; rowCount++)
		{
			for (int colCount = 1; colCount <= rowCount; colCount++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
