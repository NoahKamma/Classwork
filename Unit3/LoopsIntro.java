
public class LoopsIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(countLetters("sixseven",'s'));
System.out.println(getFactorial(5));
System.out.println(getIfRepeats("Funny"));
	}
/*
 * This counts the number of times a specific char appears in a string
 */
	public static int countLetters(String str, char c)
	{
	//Variable for a sum to be returned at end
		int charSum=0;
		
		//Iterate for every letter in str
		for(int i=0; i<str.length(); i++)
		{
			//Increment by +1 for every occurance of char
			if(str.charAt(i)== c)
			{
				charSum++;
			}
		}
		
	return charSum;
		
	}
	
	
	/*
	 * Return the factorial of the passed int
	 */
	public static int getFactorial(int num)
	{
		//Begin with int as the sum which will be returned
		int sum = num;
		
		/*
		 * Multiplies sum by num subtracted by
		 * the numbers of iterations until we reach 1
		 */
		for(int i=num-1; i>0; i--)
		{
			sum*=i;
		}
		
		//Returns the result of the factorial
		return sum;

	}
	
	/*
	 * Returns true or false depending if
	 * the passed string has two letters next to each other
	 */
	public static boolean getIfRepeats(String str)
	{
		
		/*
		 * Begin at second index and iterate 'str length'
		 * numbers of times
		 */
		for(int i=1; i<str.length(); i++)
		{
			/*
			 * Return true whenever a previous char matches
			 *a char at the index of i
			 */
			if(str.charAt(i)==str.charAt(i-1))
			{
				return true;
			}		
			
		}
		//Return false when all char pairs do not match
		return false;
	}
	
}
