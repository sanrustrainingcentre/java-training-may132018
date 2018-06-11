/**
 * Object plan for Box object.
 * 
 * @author Sanrus Training Centre
 * @version 1
 * @since 1.0.0
 *
 */
public class Box {
	
	//instance variables
	double length;
	double width;
	double depth;
	
	
	double volume()
	{
		double vol = length * width * depth;
		
		return vol;
	}
	
	void displayVolume() 
	{
		if (length < 0
				|| width < 0
				|| depth < 0) {
			System.out.println("Invalid data. Length, width and depth must be positive or zero.");
			return;
		} else {
			double vol = volume();
			System.out.println("Volume of Box = " + vol);
		}
		
		System.out.println("End of displayVolume() method");
		return;//optional return statement, by default JVM will return when the method end is reached
	}
}
