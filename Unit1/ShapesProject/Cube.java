
public class Cube {

	//Placeholder for the cube object parameters
	private int side = 0;
		
	//This converts the placeholder to the value of the parameters
	public Cube(int side)
		{
			this.side = side;
			
		}
	/*
	 * This returns the volume of the cube
	 */
	public int getVolume()
		{
			
			return side*side*side;
			
		}
		/*
		 * This returns the surface area of the cube
		 */
		public int getSurfaceArea()
		{
			
			return 6*side*side;
			
		}
		
		/*
		 * This prints the purpose of this class
		 */
		public static void stateShape()
		{
			
				System.out.println("This class generates cube shapes");
			
		}
}

