
public class Sphere 
{
	//Placeholder for the cube object parameters
	private double radius = 0.0;
	//A permanent variable for pi to be used by methods
	final double pi = 3.14;
		
	
	/*
	 * This sets the value of private variable radius to the value whatever object you substanciate
	 */
	public Sphere(double radius)
		{
		
			this.radius = radius;
		
		}
	
	
	/*
	 * Returns the volume of the sphere object
	 */
	public double getVolume()
		{
		
			return 4/3*pi*radius*radius*radius;
		
		}
	
	/*
	 * Returns the diameter of the sphere object
	 */
	public double getDiameter()
		{
		
			return 2*radius;
		
		}
	
	/*
	 * Returns the surface area of the sphere object
	 */
	public double getSurfaceArea()
	{
		
		return 4*pi*radius*radius;
		
	}
	
	
	/*
	 * This prints the purpose of this class
	 */
	public static void stateShape()
		{
				
			System.out.println("This class generates sphere shapes");
				
		}
}
