package MakeYourChoiceGame;

import java.awt.Color;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Main {

	//Dot operator object console, to "print" and do visual stuff; the extra, special-credit jframe
	public static Console console = new Console();
	
	//Increments for nextStage() for callbacks from console
	static int stage = 0;
	
	/*These variables determine the answer the player has chosen from console
	 * answerDecisions->Changes depending on decision chosen 1-3
	 * answerString->Taken from a string the player inputs
	 */
	static int answerDecisions = 0;
	static String answerString = new String ("");
	
	//Static variable for player name is established early game
	static String name = new String("");
	static int money = 0;
	
	//Initialize static characters
	static character TheMan67 = new character("TheMan67");
	static character player = new character("");
	
	
	
	
	
	public static void main(String[] args) 
	{
		//Self-explanatory
		initiateGame();

		
	}
	
	//***************
	//Order of game events goes here from top to bottom
	
	/*
	 * TheMan67 greets player and prompts a waiver
	 */
	public static void initiateGame()
	{
		
		console.setSize(600,900);
		TheMan67.speak(Text.theMan67.TheManWelcome());
		
	}

	/*
	 * The waiver body is printed and player inputs in textfield
	 */
	public static void one()
	{
		console.promptDecisions(Text.decisions.expedition(),"Yes","No");
	}
	
	/*
	 * Set the new player name
	 */
	public static void two()
	{
		if(answerDecisions==2)
		{
			console.printLine("Ending - Skeptical Civillian",Color.LIGHT_GRAY);
		}
		else
		{
			TheMan67.speak(Text.theMan67.signThis());
		}
	}
	
	/*
	 * TheMan67 instructs player to ask one question
	 */
	public static void three()
	{
		console.printBody(Text.body.waiver());
		console.promptString();
	}
	
	/*
	 * Player decides the question
	 */
	public static void four()
	{
		console.clear();
		name=answerString;
		player.setName(name);
		
		TheMan67.speak(Text.theMan67.askOne());
	}
	
	/*
	 * TheMan67 responds to player's question
	 */
	public static void five()
	{
		console.promptDecisions(Text.decisions.oneQuestion(),"What","hero","67");
	}
	
	public static void six()
	{
		TheMan67.respond(Text.response.oneQuestions());
	}
	
	public static void seven()
	{
		
	}
	
	public static void eight()
	{
		
	}
	
	public static void nine()
	{
		
	}
	
	
	//*********************
	
	
	/*A pseudo flow of control.
	 * 
	 */
	public static void callback()
	{
		stage++;
		
		switch(stage) 
		{
	  /*case 0:
	   * 	initiateGame();
	   */ //break();
		case 1:
			one();
			break;
		case 2:
			two();
			break;
		case 3:
			three();
			break;
		case 4:
			four();
			break;
		case 5:
			five();
			break;
		case 6:
			six();
			break;
		case 7:
			seven();
			break;
			
		case 8:
			eight();
			break;
		case 9:
			nine();
			break;
		case 10:
			
			break;
		case 11:
		
			break;
		case 12:
		
			break;
		case 13:
		
			break;
		}
		
	}
	
	//********************
	
}

	
