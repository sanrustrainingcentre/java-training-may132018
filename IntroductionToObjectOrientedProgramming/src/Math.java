
public class Math {
	
	int add(int x, int y)
	{
		int z = 20;//local scoped variable
		return (x + y);
	}
	
	int echo(int x)
	{
		return x;
	}
	
	void display()
	{
		System.out.println("Display() method in Math object");
	}
	
	
	double volumeOfBox(Box b)
	{
		return b.volume();
	}
	
	void method1(Box b1, Box b2) 
	{
		
	}

}
