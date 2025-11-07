
public class multiplication {

	public static void main(String[] args) 
	{
		System.out.println(multiply(6,4));
		System.out.println(multiply(5,5));
		System.out.println(multiply(3,-2));
		System.out.println(multiply(-67,1));
		System.out.println(multiply(-5,-5));
	}

	
	public static int multiply(int a, int b)
	{
		int total = 0;
		if(a<0)
		{
			
			for(int i = 0; i>a; i--)
			{
				total-=b;
			}
	
		}
		else
		{
			
			for(int i = 0; i<a; i++ )
			{
				
				total+=b;
				
			}
		}
		
		
		return total;
		
	}
}
