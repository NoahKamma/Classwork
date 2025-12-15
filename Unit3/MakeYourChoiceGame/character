package MakeYourChoiceGame;

import java.util.Scanner;

public class character {

	
	//Initialize private variables
	private double favor;
	private String name = new String("");
	private int money=0;
	private String line;
	private Scanner input = new Scanner(System.in);
	
	//Favor is how much the character likes/favors the player. 0.0 for lowest - 1.0 highest
	
	public character(String name)
	{
		this.name=name;
		setFavor(0.5);
	}
	
	/*
	 * This sets the favor value to the passed double
	 */
	public void setFavor(double duo)
	{
		favor=duo;
	}
	
	/*
	 * Changes favor value by the passed double
	 */
	public void changeFavor(double duo)
	{
		favor+=duo;
	}
	
	public double getFavor()
	{
		return favor;
	}
	
	public void setName(String str)
	{
		name=str;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void speak(String dialogue)
	{
		Console.printDialogue(name,dialogue);
	}
	
	public void respond(String response)
	{
		Console.printResponse(name,response);
	}
}
