
public class ArraysIntro {

public static void main(String[] args) {

		//An empty array for each basic primitive type, except for char
		//Added with the circle type
		int intArr[]= {};
		double doubArr[]= {};
		boolean boolArr[]= {};
		String strArr[]= {};
		Circle circArr[]= {};

		//An array for the following values in task two
		int taskTwo[]= {-7,-12,88,-88,0,5};

		/*
		*Each array type listed in task one has their default value commented
		*/
		//String Default value is null
		//We will use fruitsArr for later
		String fruitsArr[]= new String[5];
		//Int Default value is 0
		int intDef[]= new int[5];
		//Double Default value is 0.0
		double doubDef[]= new double[5];
		//Boolean Default value is false
		boolean boolDef[]=new boolean[5];
		//Circle Default value is null
		Circle circDef[]=new Circle[5];

		//Change the second element in fruitsArr to String "Bapple"
		fruitsArr[1]="Bapple";

		//Change the last element in fruitsArr to "Zanana" without using the number 4
		fruitsArr[fruitsArr.length-1]="Zanana";

		//Print the second element of fruitArr to confirm the "Zanana" change
		System.out.println(fruitsArr[1]);

		//A loop to traverse (or print out each element per iteration) in fruitsArr
		for(int i=0; i<fruitsArr.length; i++)
		{
			System.out.println(fruitsArr[i]);
		}
	
	}
}
