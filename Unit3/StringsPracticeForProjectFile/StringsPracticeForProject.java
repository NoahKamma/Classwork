import java.util.Scanner;

public class StringsPracticeForProject {
	//Static scanner object to access
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		taskOne();
		//Double space
		System.out.println("");
		
		taskTwo();

	}
	
	public static void taskOne()
	{
		System.out.print("Enter an input. The loop will stop if you input 'stop' ");
		//Print instructions
		
		//A count to print and a boolean to iterate off of
		int count = 0;
		boolean iterate = true;
		
		//Iterate as long as the answer does not equal "stop"
		while(iterate)
		{
			//Iterate and print count + prompt until "stop" is inputted
			if(!inputString().equals("stop"))
			{
				count++;
				System.out.println(count);
				System.out.println("Enter an input.");
			}
			else
			{
				System.out.println("Iteration has stopped.");
				iterate=false;
			}
		}
	}
		
	//Creates an input string and returns it, to make the process shorter
	public static String inputString()
	{
		String answer = input.nextLine();
		return answer;
	}

	//Creates an input double and returns it, likewise
	public static double inputDouble()
	{
		double answer=input.nextDouble();
		return answer;
	}

	/*
	*Make a circle object and iterate five times, each time asking for a double.
	*Then print the original radius and the sum of it along with the five doubles
	*/
	public static void taskTwo()
	{
		//Prompt user for double and create object
		System.out.println("Input your circle's radius.");
		Circle circle = new Circle(inputDouble());

		//Input a double for every iteration; a total of five iterations
		for(int i=0; i<5; i++)
		{
			System.out.println("Input a double.");
			circle.incRadius(inputDouble());
		}

		//Print original radius and cumulative radius
		System.out.println("Your circle started with a radius of " + circle.getRadius() + " and ended with a radius of " + circle.getSum());
		
	}
 
}
