
public class Square {

	//Placeholder for the square object parameters
	private int side = 0;
	
	public Square(int side)
		{
		
			this.side = side;
		
		}
	/*
	 * This returns the perimeter of the square object
	 */
	public int getPerimeter()
		{
		
			return side*4;
		
		}
	/*
	 * This returns the area of the square object
	 */
	public int getArea()
		{
		
			return side*side;
		
		}
	
	/*
	 * This returns the angle of the square object
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
		
			System.out.println("This class generates square shapes");
		
		}
}
