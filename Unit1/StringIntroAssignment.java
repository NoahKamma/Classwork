import java.util.Scanner;


public class StringIntro {

	public static void main(String[] args) {
		
		//A new scanner object is created here
		Scanner inputReader = new Scanner(System.in);
		String str = inputReader.nextLine();
		
		//Begin method calling here (The stuff that shows up on the console after an input is added)
		addDoubleSpacing();
		secondAndLastLetter(str);
		addDoubleSpacing();
		
		findTheE(str);
		addDoubleSpacing();
		
		getLength(str);
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

	public static void findTheE(String str) {
		
		int firstE = str.indexOf('e');
		
		System.out.println("The index of the first e is " + firstE );
		
		
	}
	
	public static void getLength(String str) {
		
		int length = str.length();
		
		System.out.println("The string is "+ length + " characters long");
		
	}
	
	public static void printFirstAndLastThree(String str) {
		
		String firstThreeChars = str.substring(0,3);
		String lastThreeChars = str.substring(str.length()-3, str.length()); 
		
		System.out.println("The first three characters are " + firstThreeChars + " and the last three characters are " + lastThreeChars);
		
	}
	
	/*
	 * This adds an empty line to imitate double space whenever called
	 */
	public static void addDoubleSpacing() {
		
		System.out.println();
		
	}
	
	
}
