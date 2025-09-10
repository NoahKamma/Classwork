
public class mathMethods {


	/*
	 * This executes the code
	 */
	public static void main(String[] args) {

		//Adaptable variables for positive and negative numbers of different types to be used
		int posInt = 6;
		int negInt = -6;
		double posDouble = 6.7;
		double negDouble = -6.7;
		
		
		/*
		 * Task 1
		 * 
		 * Using a singular method to print the absolute value of both ints and doubles
		 * in a orderly fashion is impossible. I made methods that print the corresponding
		 * primitive type.
		 */
		getAbs(posInt);
		getAbs(negInt);
		getAbs(posDouble);
		getAbs(negDouble);
		
		/*
		 * Task 2
		 */
		getPow(posInt,negInt);
		getPow(negInt,posInt);
		
		/*
		 * Task 3
		 * 
		 * Negative numbers cannot be sqrt-ed, therefore they return as "NaN"
		 */
		getSqrt(posInt);
		getSqrt(negInt);
		getSqrt(posDouble);
		getSqrt(negDouble);
		
		
		/*
		 * Task 4
		 */
		getRandomNum();
		
		
	}
	
	/*
	 * Prints the absolute value of int numbers
	 * 
	 * Void method allows the input to be returned
	 * 
	 * Is overloaded because method calling caters to both primitive types
	 */
	public static void getAbs(int num) {
		
		System.out.println("Absolute value: " + java.lang.Math.abs(num));

	}
	
	/*
	 * Prints the absolute value of int numbers
	 * 
	 * Void method allows the input to be returned
	 * 
	 * Is overloaded because method calling caters to both primitive types
	 */
	public static void getAbs(double num) {
		
		System.out.println("Absolute value: " + java.lang.Math.abs(num));

	}
	
	
	/*
	 * Prints int number one to the power of int number two
	 * 
	 * Void method allows the input to be returned
	 * 
	 *Is not overloaded because method only calls for ints
	 */
	public static void getPow(int num1, int num2) {
		
		
		System.out.println("Power: " + java.lang.Math.pow(num1,num2));
	
	}
	
	/*
	 * Prints the square root of a int
	 * 
	 * Is overloaded because the method calls for ints and doubles
	 */
	public static void getSqrt(int num) {
		
		System.out.println("Square Root: "+java.lang.Math.sqrt(num));
		
	}
	
	/*
	 * Prints the square root of a double
	 * 
	 * Is overloaded because the method calls for ints and doubles
	 */
	public static void getSqrt(double num) {
		
		System.out.println("Square Root: "+java.lang.Math.sqrt(num));
		
	}
	
	public static void getRandomNum() {
		
		System.out.println("Random Number: "+((int)(10*(java.lang.Math.random()))+11));
		
	}
}


