
public class CircleDemo 
{

	public static void main(String[] args) 
	{
		int x = 0;
		int marks[] = new int[10];
		
		marks[0] = 90;
//		System.out.println(marks[0]);
		
		//creating a circle object
		Circle circle = new Circle();
		circle.name = "yellow circle";
		circle.radius = 2.0;
		
		//creates rectangle object
		Rectangle rectangle = new Rectangle();
		
		System.out.println(circle.name);
		System.out.println(circle.radius);
		
		double areaOfCircle = circle.area();
		System.out.println("Area of circle = " + areaOfCircle);
		
	}

}
