/*
This class prints the surface area and volume of a cube when you give it a side length. 
It uses the number for side length to calculate surface area and volume using their respective formulas, before printing it
within a full sentence.
*/
public class CubeCalculator {

	public static void CubeCalculator(String[] args) {

//Assign your cube's side length here, so the class can reference from it
		double sideLength = 2;

		//This uses the formulas for surface area and volume to calculate them
				double surfaceArea = 6 * sideLength * sideLength;
				double volume = sideLength*sideLength*sideLength;
				
				
				//This prints out the cube's surface area and volume as Ints in a full sentence
				System.out.print("The cube's surface area is "+((int)surfaceArea)+" and its volume is "+ ((int)volume)+".");
	}
	

}
