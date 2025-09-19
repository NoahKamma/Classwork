import java.util.Scanner;


public class StringIntro {
/*
 * This will call some methods after the user inputs something
 */
	public static void main(String[] args) {
		
		//A new scanner object is created here for the user to input
		Scanner inputReader = new Scanner(System.in);
		String str = inputReader.nextLine();
		
		//The following methods will be called when the scanner object is named
		addDoubleSpacing();
		secondAndLastLetter(str);
		addDoubleSpacing();
		
		System.out.println("The first E takes place within index " + findTheE(str) );
		addDoubleSpacing();
		
		System.out.println("The length is " + getLength(str));
		addDoubleSpacing();
		
		printFirstAndLastThree(str);
		
		inputReader.close();
	}
	
	/*
	 * This prints the second and last letter of the input
	 */
	public static void secondAndLastLetter(String str) {

		
		char secondLetter = str.charAt(1);
		char lastLetter = str.charAt(str.length()-1);
		
		System.out.println ("The second letter is " + secondLetter + " and the last letter is " + lastLetter );
		
	}

	/*
	 * This finds the first e that takes place within the object
	 */
	public static int findTheE(String str) {
		
		return str.indexOf('e');
		
		
	}
	
	/*
	 * This prints the length of the object
	 */
	public static int getLength(String str) {
		
		return str.length()-1;
		
		
	}
	
	/*
	 * This prints the first and last three letters of the object
	 */
	public static void printFirstAndLastThree(String str) {
		
		String firstThreeChars = str.substring(0,3);
		String lastThreeChars = str.substring(str.length()-3, str.length()); 
		
		System.out.println("The first three characters are " + firstThreeChars + " and the last three characters are " + lastThreeChars);
		
	}
	
	/*
	 * This adds an empty line to imitate double spacing whenever called
	 * For neatness!
	 */
	public static void addDoubleSpacing() {
		
		System.out.println();
		
	}
	
	
}
