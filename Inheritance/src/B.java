
public class B extends A
{
	//similar 'x' variable is already declared in class A
	//so class B 'x' variable is hiding the declaration of class A scope.
	//in order to access class A 'x' variable, use 'super.x' in your method.
	int x = 30;
	int j;
	
	void methodB()
	{
		System.out.println("x value from class B => " + x);
		System.out.println("x value from class A => " + super.x);
	}
}
