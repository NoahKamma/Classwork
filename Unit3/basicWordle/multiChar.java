
public class multiChar {

	private char Char = ' ';
	private int count= 0;
	private int oldCount=0;
	
	//Initialize attributes
	public multiChar(char Char, int count) 
	{
		//Char and how many instances in star word
		this.Char=Char;
		this.count=count;
		oldCount=count;
		
	}
	
	public void newChar(char Char)
	{
		this.Char=Char;
		oldCount=Char;
		count=2;
	}
	
	/*
	 * Used when an instance a recurring char is found in answer
	 */
	public void minus()
	{
		count--;
	}
	
	/*
	 * Use only when an additional instance of char is found in star word
	 */
	public void add()
	{
		count++;
		oldCount++;
	}
	
	//Access the current count 
	public int count()
	{
		return count;
	}
	
	//Access the char
	public char Char()
	{
		return Char;
	}
	
	
	//Reset to original count
	public void reset()
	{
		count=oldCount;
	}
	

}
