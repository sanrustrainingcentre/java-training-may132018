
public class Box {
	
	double length;
	double width;
	double height;
	
	//parameterized constructor
	Box(double length, double width, double height)
	{
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	Box(double l, double w)
	{
		length = l;
		width = w;
		height = 1;
	}
	
	Box()
	{
		length = 1;
		width = 1;
		height = 1;
	}
	
	Box(Box b)
	{
		length = b.length;
		width = b.width;
		height = b.height;
	}
	
	double volume() {
		return width * length * height;
	}

}
