
public class NestLoopsHomework {

	public static void main(String[] args) {
		
		
		buildMultTable(12);
		
	}
	
	public static void buildMultTable(int num)
	{
		
		//Iterate num amount of times
		//This accounts for number of lines in table
		for(int i = 1; i<=num; i++)
		{
			//firInt accounts for current line number
			int firInt=i;
			
			//secInt accounts for a current number on a line
			//Iterates num amount of times
			for(int secInt=1; secInt<=num; secInt++)
			{
				//Print the product of first and sec Int & tab
				System.out.print(firInt*secInt+"\t");
			}
			
			System.out.println("");
		}
	}
}
