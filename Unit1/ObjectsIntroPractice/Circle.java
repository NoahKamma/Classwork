
public class Circle 
	{

	//Placeholder value for radius, which will be replaced by the value you choose through the constructor
	//Methods will reference from this value
		private double radius = 0.0;
		
	//A permanent variable for pi to be used by methods
		private final double pi = 3.14;
		
		/*
		 * This sets the value of private variable radius to the value whatever object you substanciate
		 */
		public Circle(double radius)
			{
	
				this.radius = radius;
					
			}
		
		/*
		 * Returns the radius of the circle object
		 */
		public double getRadius()
			{
			
				return radius;
			
			}
		
		/*
		 * Sets the value of private radius to the value of the circle object
		 */
		public void setRadius(double newRadius)
			{
			
				radius = newRadius;
			
			}
		
		/*
		 * This returns the circumference of the circle object
		 */
		public double getCircumf()
			{
			
				return (2*pi*radius);
			
			}
		
		/*
		 * This returns the area of the circle object
		 */
		public double getArea()
			{
			
				return (pi*radius*radius);
			
			}
		
		/*
		 * This returns the degrees of the circle object
		 */
		public static int getDegrees()
			{
			
				return 360;
			
			}
		
		/*
		 * This prints the purpose of the class
		 */
		public static void stateShape()
			{
			
			System.out.println("This class generates Circle shapes.");
			
			}
		
	}
