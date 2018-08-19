import static mathfolder.Math.PI;
import static mathfolder.Math.add;

import mathfolder.Math;

public class Circle 
{
	private double radius;
	private static int count;
	private final static int X;
	
	static
	{
		//this is static initialization block
		//for initializing all static variables.
		//called for only once per class loaded in memory.
		X = 100;
	}
	
	Circle(final double radius) {
		this.radius = radius;
		count++;
	}
	
	double area()
	{
		Math m1 = new Math();
		int result = add(2,  3);
		//m1.PI also works, which means static members are accessed
		//through object scope.
		return PI  * radius * radius;
	}
	
	//accessor method or getter method for 'count' instance variable
	//gets count value 
	public static int getCount() {
		return count;
	}

}
