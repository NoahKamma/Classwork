/*I am practicing a how to call and use methods. For this practice, I made methods that can:
 * 1) Print five characteristics about me
 * 2)Print the radius, diameter and area of a circle when passing through a double number.
 * 3)Print the sum, difference, product, quotient and remainder of two double numbers.
 */
public class methodsIntro {

	/*
	 * Call your void methods under the main method
	 */
	public static void main(String[] args) {
//Task  One
		stateName();
		stateHairStyle();
		stateFavoriteFood();
//Task Two
		printCircleStats(4.0);
//Task Three
		printMathStuffs(2,2);
		
	}
	
	/*
	 * This method can print my name when called
	 */
	public static void stateName() {
		System.out.print("Noah ");
		
	}
	
	/*
	 * This method can print my eye color when called
	 */
	public static void stateEyeColor() {
		System.out.print("Black ");
		
	}
	
	/*
	 * This method can print my hair style when called
	 */
	public static void stateHairStyle() {
		System.out.print("Side Part ");
		
	}
	
	/*
	 * This can print my best friend when called
	 */
	public static void stateBestFriend() {
		System.out.print("I dunno ");
		
	}

	/*
	 * This can print my favorite food when called.
	 */
	public static void stateFavoriteFood() {
		System.out.println("Steak ");
		
	}

	/*
	 * This method prints the radius, diameter and area of a circle when passing through a double number.
	 */
	
	public static void printCircleStats(double radius) {
		
	//The final number of pi.
		final double pi = 3.14;
			    
		double diameter = 2.0*radius;
		double area = pi*radius*radius;
		double circumference = 2.0*pi*radius;

		System.out.println("The radius is "+radius+", "+"the diameter is "+diameter+", "+"the area is "+area+", "+"and the circumference is "+circumference+"." );
	

	}
	
	public static void printMathStuffs (int firstNum, int secondNum) {
	
		//Formulas for the sum, difference, quotient and remainder to solve
		int sum = firstNum + secondNum;
		int difference = firstNum - secondNum;
		int quotient = firstNum/secondNum;
		int remainder = firstNum%secondNum;
		
		//This prints the respective answers of the formulas above.
		System.out.println("Sum: "+sum+" Difference: "+difference+" Quotient: "+quotient+" Remainder: "+remainder);
		
	}
	
		
}
