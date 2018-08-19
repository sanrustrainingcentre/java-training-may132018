
public class Math {
	
	double add(double x, double y) 
	{
		System.out.println("double add(double x, double y)");
		return (x + y);
	}
	
	int add(int x, int y)
	{
		System.out.println("int add(int x, int y)");
		return (x + y);
	}
	
	int add(byte a, byte b)
	{
		System.out.println("int add(byte a, byte b)");
		return (a + b);
	}
	
	int add(double x, int y)
	{
		System.out.println("int add(double x, int y)");
		return (int) (x + y);
	}

}
