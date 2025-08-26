public class CubeCalculator {

	public static void CubeCalculator(String[] args) {

//Assign your cube's side length here	
		double sideLength = 2;

		//This calculates the surface area and volume
				double surfaceArea = 6 * sideLength * sideLength;
				double volume = sideLength*sideLength*sideLength;
				
				
				//This prints out the surface area and volume as Ints in a full sentence
				System.out.print("The cube's surface area is "+((int)surfaceArea)+" and its volume is "+ ((int)volume)+".");
	}
	

}
