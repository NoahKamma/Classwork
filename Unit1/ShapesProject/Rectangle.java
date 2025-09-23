
public class Rectangle {

	//Placeholders for the rectangle object parameters
private int side1 = 0;
private int side2 = 0;
	
/*
 * Sets the private variables, side1 and side2, to the value of the current object's parameters
 */
	public Rectangle(int side1, int side2)
		{
		
			this.side1 = side1;
			this.side2 = side2;
		
		}
	/*
	 * This returns the perimeter of the rectangle object
	 */
	public int getPerim()
		{
		
			return (2*side1)+(2*side2);
		
		}
	/*
	 * This returns the area of the rectangle object
	 */
	public int getArea()
		{
		
			return side1*side2;
		
		}
	
	/*
	 * This returns the angle of the rectangle object
	 */
	public static int getAngle()
	
		{
		
			return 90;
		
		}
	
	/*
	 * This prints the purpose of this class
	 */
	public static void stateShape()
	{
	
		System.out.println("This class generates rectangle shapes");
	
	}
}

