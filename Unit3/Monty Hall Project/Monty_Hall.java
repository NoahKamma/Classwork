import java.util.Scanner;

public class Monty_Hall {
	
	static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		
		script();
	}

public static void script() {
		
	
	
		
		
		//Chose a door with a prize
		int prizeDoorNum = (int)(3*java.lang.Math.random()+1);
		
		//Three new door objects to chose from
		Door door1 = new Door(1);
		Door door2 = new Door(2);
		Door door3 = new Door(3);
		
		
		/*
		 * Set prize door object prize to true
		 */
		if(door1.getNum() == prizeDoorNum)
		{
			door1.setPrize();
			
		}
		else if(door2.getNum() == prizeDoorNum)
		{
			door2.setPrize();
		}
		else
		{
			door3.setPrize();
		}
		
		
		//Print three ACII doors & give instructions 
		oneTwoThree();
		System.out.println("Choose a Door (1,2,3)");
		System.out.println();
	
		//New scanner object to choose a door
		
		String answer = input.nextLine();
		
		int chosenDoor = filterFirstAnswer(answer);
		
			/*
			 * Player chooses one of two door scenarios, depending on if the chosen door is correct
			 */
			if(chosenDoor == prizeDoorNum)
			//When chosen door is correct
			{	
				
				
				//Select a random wrong door and eliminate the other
				final int wrongDoorNum = TwoWrongDoors(chosenDoor);
				
				//Print the chosen door with the random wrong door
				//Player must choose "Stay" to win
				printTwoDoors(prizeDoorNum, wrongDoorNum);
				
			}
			else
			//When chosen door is wrong
			{	
				
				/*
				 * Eliminate the unchosen wrong door and print the other doors
				 * Player must choose "Switch" to win
				 */
				 printTwoDoors(chosenDoor, prizeDoorNum);
				 
			}
			
			
			String finalAnswer = input.nextLine();
			
			
			String chosenSwitchStay = new String(filterSecondAnswer(finalAnswer));
			
			
			switchStayInput(chosenDoor, prizeDoorNum, chosenSwitchStay);
			
			System.out.println("");
			System.out.println("Enter 'restart' if you want to restart the game. Enter anything else to end it.");
			System.out.println("");
			Scanner restartInput = new Scanner(System.in);
			String checkRestart = restartInput.nextLine();
			
			
			if(checkRestart.contains("restart") || checkRestart.contains("Restart"))
			{
				script();
				restartInput.close();
			}
			else
			{
				System.out.println();
				System.out.println("Goodbye player.");
				restartInput.close();
				input.close();
			}
			
			
			
			
			
		}
	/*
	 * This forces the player to reinput a valid answer for the int
	 */
	public static int filterFirstAnswer(String answer)
	{
		if( (!answer.equals("1")&&  !answer.equals("2") && !answer.equals("3") ) || ((answer.equals("1") &&  answer.equals("2")) || (answer.equals("2") &&  answer.equals("3")) ||  (answer.equals("1") &&  answer.equals("3")))  )
		{
			//If player does not enter 1, 2, or 3, start recursion until they enter in a valid answer
			System.out.println("Please enter a valid answer. (Options: 1, 2, 3)");
			System.out.println();
			String newAnswer = input.nextLine();
			
			return filterFirstAnswer(newAnswer);
		}
		else
		{
			//If player enters valid answer, return in form of an int
			if(answer.equals("1"))
			{
				return 1;
			}
			else if(answer.equals("2"))
			{
				return 2;
			}
			else
			{
					return 3;
			}
		}
		
	}
	
	/*
	 * This forces the player to reinput a valid answer for the String
	 */
	public static String filterSecondAnswer(String answer)
	{
		
		if(!answer.contains("tay") && !answer.contains("witch") || (answer.contains("witch") && answer.contains("tay")) )
		{
			//If player does not comply, start recursion
			
			
				//If the player enters a wrong response starting from at least one time, this will print
				//Note: Hard code to fix the issue of printing after the player chooses a door
			System.out.println();
			System.out.print("Please enter a valid answer. (Options: Switch, Stay)");
			System.out.println();
			
			
			String newAnswer = input.nextLine();
			return filterSecondAnswer(newAnswer);
		}
		
		else
		{
			//If player enters a valid answer, exit recursion
			return answer;
		}
		
	}
		
	/*
	 * Scan for the players final, valid answer on switch or stay
	 */
	public static void switchStayInput(int chosenDoor, int prizeDoorNum, String finalAnswer)
	{

		//Scan input for switch or stay
	
		if(finalAnswer.contains("witch"))
		{
			//Player wins if the chosen door was wrong
			if(chosenDoor != prizeDoorNum)
			{
				winGame();
			}
			else
			{
				loseGame();
			}
		}
		else if (finalAnswer.contains("tay"))
		{
			//Player wins if the chosen door was right
			if(chosenDoor == prizeDoorNum)
			{
				winGame();
			}
			else
			{
				loseGame();
			}
			
			
		}
		
	
		
	}
	
	/*
	 * Prints if player wins 
	 */
	public static void winGame()
	{
		
		System.out.println();
		System.out.println("Congratulations, you have won the prize!");
	}
	
	/*
	 * Prints if player loses
	 */
	public static void loseGame()
	{
		
		System.out.println();
		System.out.println("Unfortunately, you have chosen the empty door. You have lost the game.");
	}
	
	/*
	 * Print which door has been eliminated and ask the player to switch or stay
	 */
	public static void announceSecondRound(int revealDoor, int chosenDoor)
	{
		
		System.out.println("You have chosen Door #" + chosenDoor + "." +" Door #" + revealDoor + " has been revealed to be empty. Stay with your original choice or switch? (Stay or Switch)");
		System.out.println();
	}
	
	/*
	 * Chooses a random door from the two unchosen, incorrect doors for the second round
	 */
	public static int TwoWrongDoors(int chosenDoor)
	{
		//New empty array for remaining doors
		/*
		 * Will be used to create a randomizer that chooses an incorrect
		 * door to be used for the second round (switch or stay)
		 */
		int twoDoors[] = new int[2];
		
		//Compile the remaining doors
		
		if(chosenDoor == 1)
		{
			
			twoDoors[0] = 2;
			twoDoors[1] = 3;
		
		}
		else if(chosenDoor == 2)
		{
			
			twoDoors[0] = 1;
			twoDoors[1] = 3;
			
		}
		else
		{
			twoDoors[0] = 1;
			twoDoors[1] = 2;
			
			
		}
		
		//Pick a random door from the two before returning it
		int randomWrongDoor = (int)(1*java.lang.Math.random());
		
		return twoDoors[randomWrongDoor];
		
		
	}
	
	/*
	 * Print the doors for the second round
	 */
	public static void printTwoDoors(int chosenDoor, int otherDoor)
	{
		
		if(chosenDoor + otherDoor == 3)
		{
			//Print door 1 & Door 2 
			oneTwo();
			announceSecondRound(3,chosenDoor);
			
		}
		else if(chosenDoor + otherDoor == 4)
		{
			//Print door 1 & Door 3
			oneThree();
			announceSecondRound(2,chosenDoor);
			
		}
		else
		{
			//Print door 2 & Door 3
			twoThree();
			announceSecondRound(1,chosenDoor);
			
		}
		
	}
	
	
	
	
	/*
	 * This is printed when the code is first run. It represents the three doors to be chosen
	 */
	public static void oneTwoThree()
	{
		System.out.println(" __________     __________     __________ ");
		System.out.println("|  __  __  |   |  __  __  |   |  __  __  |");
		System.out.println("| |  ||  | |   | |  ||  | |   | |  ||  | |");
		System.out.println("| |  ||  | |   | |  ||  | |   | |  ||  | |");
		System.out.println("| |__||__| |   | |__||__| |   | |__||__| |");
		System.out.println("|  __  __()|   |  __  __()|   |  __  __()|");
		System.out.println("| |  ||  | |   | |  ||  | |   | |  ||  | |");
		System.out.println("| |  ||  | |   | |  ||  | |   | |  ||  | |");
		System.out.println("| |  ||  | |   | |  ||  | |   | |  ||  | |");
		System.out.println("| |  ||  | |   | |  ||  | |   | |  ||  | |");
		System.out.println("| |__||__| |   | |__||__| |   | |__||__| |");
		System.out.println("|__________|   |__________|   |__________|");
	}
	
	/*
	 * The next three methods visualizes the remaining doors.
	 */
	
	
	public static void twoThree()
	{
		System.out.println("                __________     __________ ");
		System.out.println("               |  __  __  |   |  __  __  |");
		System.out.println("               | |  ||  | |   | |  ||  | |");
		System.out.println("               | |  ||  | |   | |  ||  | |");
		System.out.println("               | |__||__| |   | |__||__| |");
		System.out.println("               |  __  __()|   |  __  __()|");
		System.out.println("               | |  ||  | |   | |  ||  | |");
		System.out.println("               | |  ||  | |   | |  ||  | |");
		System.out.println("               | |  ||  | |   | |  ||  | |");
		System.out.println("               | |  ||  | |   | |  ||  | |");
		System.out.println("               | |__||__| |   | |__||__| |");
		System.out.println("               |__________|   |__________|");
	}
	
	public static void oneThree()
	{
		System.out.println(" __________                    __________ ");
		System.out.println("|  __  __  |                  |  __  __  |");
		System.out.println("| |  ||  | |                  | |  ||  | |");
		System.out.println("| |  ||  | |                  | |  ||  | |");
		System.out.println("| |__||__| |                  | |__||__| |");
		System.out.println("|  __  __()|                  |  __  __()|");
		System.out.println("| |  ||  | |                  | |  ||  | |");
		System.out.println("| |  ||  | |                  | |  ||  | |");
		System.out.println("| |  ||  | |                  | |  ||  | |");
		System.out.println("| |  ||  | |                  | |  ||  | |");
		System.out.println("| |__||__| |                  | |__||__| |");
		System.out.println("|__________|                  |__________|");
	}
	
	public static void oneTwo()
	{
		System.out.println(" __________     __________ ");
		System.out.println("|  __  __  |   |  __  __  |");
		System.out.println("| |  ||  | |   | |  ||  | |");
		System.out.println("| |  ||  | |   | |  ||  | |");
		System.out.println("| |__||__| |   | |__||__| |");
		System.out.println("|  __  __()|   |  __  __()|");
		System.out.println("| |  ||  | |   | |  ||  | |");
		System.out.println("| |  ||  | |   | |  ||  | |");
		System.out.println("| |  ||  | |   | |  ||  | |");
		System.out.println("| |  ||  | |   | |  ||  | |");
		System.out.println("| |__||__| |   | |__||__| |");
		System.out.println("|__________|   |__________|");
	}
	
	
}
