/*
 *1. Create a nonvoid method called stateName() that returns your name. Repeat this task for stateEyeColor(), stateHairStyle(), stateBestFriend(), and stateFavoriteFood(). Then, call stateName(), stateHairStyle, and stateFavoriteFood(). Use the calls to make a full print statement. 

2. Create a nonvoid method printCircleStats() that is passed a double (meant to represent a circle's radius) and calculates then returns the radius, diameter, circumference, and area of the circle. Call the method in a print statement or variable declaration in order to make a complete print statement of all the properties. 

3. Create nonvoid methods that are passed two ints and returns their sum, difference, product, quotient, and the remainder (using modulus) of the first number modulus the second number; all operations should be their own respective methods. Call them inside print statements to make sure they work.  
 */

public class nonvoidMethodPractice {

	public static void main(String[] args) {
		
		
		//Task One
		System.out.println("Name is "+giveName()+", Hair Style is "+giveHairStyle()+", and Favorite Food is "+giveFavoriteFood() );
		
		//Task Two
		double insertRadius = 4.0;
		
		System.out.println("Radius: " + giveRadius(insertRadius) + " Diameter: " + giveDiameter(insertRadius) + " Circumference: " + giveCircumference(insertRadius) + " Area: " + giveArea(insertRadius));
		
		//Task Three
		int firstNum = 6;
		int secondNum = 7;
		
		
		System.out.println("Sum: " + giveSum(firstNum,secondNum) + " Difference: " + giveDifference(firstNum,secondNum) + " Product: " + giveProduct(firstNum,secondNum) + " Quotient: " + giveQuotient(firstNum,secondNum) + " Remainder: " + giveRemainder(firstNum,secondNum) );
		
		
	}

	/*
	 * Task One
	 * 
	 * The following five methods returns my name, my best friend, my hair style, my favorite food and my favorite eye color 
	 * 
	 */
	
	public static String giveName() {
		
		return "Noah";
	}

	public static String giveBestFriend() {
		
		return "i dunno";
	}

	public static String giveHairStyle() {
		
		return "Sidepart";
	}

	public static String giveFavoriteFood() {
		
		return "Steak";
	}

	public static String giveEyeColor() {
		
		return "Black";
	}

	
/*
 * Task Two
 * 
 * The following five methods prints the radius, diameter, circumference and area of a circle, when inserting the respective, adaptive variable
 * 
 */
	
	public static double giveRadius (double radius) {
		
		return radius;

	}
	
	public static double giveDiameter (double radius) {
		
		return 2*radius;

	}
	
	public static double giveCircumference (double radius) {
		
		return 2*3.14*radius;

	}	
	public static double giveArea (double radius) {
		
		return 3.14*radius*radius;

	}
	
	
	

	/*
	 * Task 3
	 * 
	 * The following gives the sum, difference, product, quotient, and remainder of two adaptable in variables.
	 * 
	 */
	
	public static int giveSum (int firstNum, int secondNum) {
		
		return firstNum + secondNum;
		
	}
	
	public static double giveDifference (int firstNum, int secondNum) {
		
		return firstNum - secondNum;
		
	}
	
	public static double giveProduct (int firstNum, int secondNum) {
		
		return firstNum * secondNum;
		
	}
	
	public static double giveQuotient (int firstNum, int secondNum) {
		
		return firstNum / secondNum;
		
	}
	
	public static double giveRemainder (int firstNum, int secondNum) {
		
		return firstNum % secondNum;
		
	}
	
}


