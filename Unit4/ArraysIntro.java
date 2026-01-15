
public class ArraysIntro {

public static void main(String[] args) {
		
		int intArr[]= {};
		double doubArr[]= {};
		boolean boolArr[]= {};
		String strArr[]= {};
		Circle circArr[]= {};
		
		int taskTwo[]= {-7,-12,88,-88,0,5};
		
		//Default value is null
		String fruitsArr[]= new String[5];
		//Default value is 0
		int intDef[]= new int[5];
		//Default value is 0.0
		double doubDef[]= new double[5];
		//Default value is false
		boolean boolDef[]=new boolean[5];
		//Default value is null
		Circle circDef[]=new Circle[5];
		
		fruitsArr[1]="Bapple";
		
		fruitsArr[fruitsArr.length-1]="Zanana";
		
		System.out.println(fruitsArr[4]);
		
		for(int i=0; i<fruitsArr.length; i++)
		{
			System.out.println(fruitsArr[i]);
		}
	
	}
}
