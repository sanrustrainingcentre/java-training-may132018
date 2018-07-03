package demo;

public class Box 
{
	
	private double height;
	private double width;
	private double thickness;
	
	Box(double height, double width, double thickness)
	{
		this.height = height;
		this.width = width;
		this.thickness = thickness;
	}
	
	double volume()
	{
		return height * width * thickness;
	}

	//mutator method or setter method
	//that changes value for 'height' instance variable
	//write access for height variable is done through this method.
	void setHeight(double height)
	{
		if (height >= 0) {
			this.height = height;
		}
	}
	
	
	//accessor method for retrieving height of Box object
	//read-only method for height instance variable
	double getHeight() 
	{
		return height;
	}
}
