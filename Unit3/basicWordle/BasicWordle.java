import java.util.Scanner;

public class BasicWordle 
{
	//New scanner object to await user input
	static Scanner input = new Scanner(System.in);
	//Empty array to contain the 5 letter word in chars
	static char[] starWord = new char[5];
	static multiChar[] multiChar= new multiChar[2];

	public static void main(String[] args) 
	{
		setArrays();
		setMultiChar();
		
		
		System.out.println("Please make a guess! (No numbers, lowercase, 5 letter long answer)");
		System.out.println("X = letter is not found in answer");
		System.out.println("? = letter is found in answer but in the wrong place");
		System.out.println("");
;		game();
		
		input.close();
	}
	
	public static void game()
	{
		//Variable for player attempts
		int tries = 6;
		while(tries>0)
		{
			
			//Run isValid Answer until a valid answer is inputted
			String answer = isValidAnswer();
		
			if(	checkAnswer(answer))
			{
				//When answer is correct, end the game
				tries=0;
				System.out.println("");
				System.out.println("You guessed the word!");
			}
			else if(tries==1)
			{
				//If all 5 answers are incorrect and you are out of attempts, end iteration and game over
				System.out.println("");
				System.out.println("You ran out of attempts, Game Over.");
				tries=0;
			}
			else
			{
				//You still have tries left but its incorrect, state # of attempts and lose 1 attempt
				tries--;
				System.out.println("");
				printResult(answer);
				System.out.println("");
				System.out.println("You have " + tries + " attempts left.");
				System.out.println("");
			}
			
				
		}
	}
	
	/*
	 * This prints the results of guess when wrong
	 */
	public static void printResult(String answer)
	{
		for(int i=0; i<5; i++)
		{
			
			if(answer.charAt(i)==starWord[i])
			{
				//If completely correct
				System.out.print(answer.charAt(i));
				
			}
			else
			{
				//If iterated char of answer is an multChar
				if(answer.charAt(i)==multiChar[0].Char())
				{
					if(multiChar[0].count()>0)
					{
						//It's a misplaced multiChar
						System.out.print('?');
						multiChar[0].minus();
					}
					else
					{
						//Too much multiChar in answer, start printing 'X'
						System.out.print('X');
					}
				}
				else if(answer.charAt(i)==multiChar[1].Char())
				{
					if(multiChar[1].count()>0)
					{
						//It's a misplaced multiChar
						System.out.print('?');
						multiChar[1].minus();
					}
					else
					{
						//Too much multiChar in answer, start printing 'X'
						System.out.print('X');
					}
				}
				else
				{
					//It's a normal char
					int index=0;
					boolean misPlace=false;
					while(index<5)
					{
						//Anytime it is found in another index of star word, it is misplaced
						if(answer.charAt(i)==starWord[index])
						{
							
							misPlace=true;
							index=5;
							
						}
						index++;
					}
					
					//Print 'X' or '?' depending if it is misplaced or wrong
					if(misPlace)
					{
						System.out.print('?');
					}
					else
					{
						System.out.print('X');
					}
				}
				
			}
			
		}
		multiChar[0].reset();
		multiChar[1].reset();
	}
	
	
	/*
	 * Returns boolean based on if answer is accurate to star word
	 */
	public static boolean checkAnswer(String answer)
	{
	
		for(int i=0; i<5; i++) {
			
			if(answer.charAt(i)!=starWord[i])
			{
				
				return false;
			}
		}
		
		return true;
	}
	
	/*
	 * Set up the arrays for game
	 */
	public static void setArrays()
	{
		//Initialize star word "melee"
		
		int random = (int)(2*java.lang.Math.random());
		
	if(random==0)
	{
		starWord[0]='m';
		starWord[1]='e';
		starWord[2]='l';
		starWord[3]='e';
		starWord[4]='e';
	}
	else
	{
		starWord[0]='a';
		starWord[1]='l';
		starWord[2]='i';
		starWord[3]='b';
		starWord[4]='i';
	}
				
		//Placeholders for multiChar to avoid "null" syntax error
		multiChar[0]= new multiChar('X',0);
		multiChar[1]= new multiChar('X',0);
	}
	
	public static void setMultiChar()
	{
		//Count down from last index of star word; skip the first index
		for(int i=4; i>0; i--)
		{
			//Look at the previous indexes of iterated index; iterated index to each previous index
			for(int preI=i-1; preI>0; preI--)
			{
				//
				if(starWord[i]==starWord[preI])
				{
					if(multiChar[0].Char()=='X'){
						multiChar[0].newChar(starWord[i]);
					}
					else
					{
						if(multiChar[0].Char()==starWord[i]) {
							multiChar[0].add();
						}
						else
						{
							if(multiChar[1].Char()=='X') {
								multiChar[0].newChar(starWord[i]);
							}
							else
							{
								//MultiChar==starWord
								multiChar[1].add();
							}
						}
					}
				}
			}
		}
	}
	
	
	/*
	 * Checks if the player's next inputted answer is valid and meets the conditions
	 */
	
	public static String isValidAnswer()
	{
		String a = input.nextLine();
		if(!isLength(a) || !isNoNum(a))
		{
			System.out.println("Invald answer");
			return isValidAnswer();
		}
		else
		{
			return a;
		}
		
	}
	
	/*
	 * This returns a boolean on if the answer is 5 letters
	 */
	public static boolean isLength(String answer)
	{
		if(answer.length() == 5)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/*
	 * This returns a boolean on if the answer has any letters
	 */
	public static boolean isNoNum(String answer)
	{
		for(int i=0; i>answer.length(); i++)
		{
			if(Character.isLetter(answer.charAt(i)))
			{
				return false;
			}
		}
		
		return true;
		
	}
	
	/*
	 * Checks if star word has two or more of a char
	 * Return char if there is, otherwise return '0'
	 */
	public static char isDuoChar()
	{
		//Compares current index to the previous indexes per iteration
		for(int currentIn=0; currentIn>5; currentIn++)
		{
			for(int preIn=0; preIn>currentIn; preIn++)
			{
				if(starWord[currentIn]==starWord[preIn])
				{
					return starWord[currentIn];
				}
			}
		}
		
		return '0';
		
	}
}
	Ba
