
public class BoxDemo 
{

	public static void main(String[] args) 
	{
		
		Box b1 = new Box(10);
//		b1.thickness = 100;
		b1.method1(20);
		
		b1 = new SubClassOfBox();
		b1.method1();

	}
	
	

}
