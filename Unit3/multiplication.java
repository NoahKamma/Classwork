
public class multiplication {

	public static void main(String[] args) 
	{
		System.out.println(multiply(6,4));
		System.out.println(multiply(5,5));
		System.out.println(multiply(3,-2));
		System.out.println(multiply(-67,1));
		System.out.println(multiply(-5,-5));
	}

	/*
	*This multiplies 'a' by 'b'. Works with negative numbers too
	*/
	public static int multiply(int a, int b)
	{
		//Total variable to add or subtract 'b'
		int total = 0;

		//When 'a' is negative
		if(a<0)
		{
			//Minus by 'b' by 'a' amount of times
			for(int i = 0; i>a; i--)
			{
				total-=b;
			}
	
		}
		else
		{
		//When 'b' is negative

			//Add 'b' by 'a' amount of times
			for(int i = 0; i<a; i++ )
			{
				
				total+=b;
				
			}
		}
		
		//Return the total after the loop
		return total;
		
	}
}
