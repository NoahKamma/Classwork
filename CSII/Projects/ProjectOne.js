package stuff;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class ProjectOne {

	public static void main(String[] args) {
		
		File file = new File("inputFile1.txt");
		
		System.out.println(projectOne(file));

	}
	
	public static int projectOne(File file)
	{	
		try(Scanner scanner = new Scanner(file))
		{
			int minMax=100;
			
			int n=scanner.nextInt();
			int m=scanner.nextInt();
			
			//Initialize a 2d arr for n streets and m avenues
			int restaurant=0;
			for(int i=0; i<n; i++)
			{
				
				// restaurant[i/n][0]
				//Restaurant at index 0 is our default max
				restaurant =scanner.nextInt();
				int max=restaurant;
				
				for(int j=1; j<m; j++)
				{
					restaurant=scanner.nextInt();
					
					//Traverse for the max cost on the street
					if(restaurant>max)
					{
						max=restaurant;
					}
				}
				
				//Calculate for the lowest maximum cost within n & m
				if(max<minMax)
				{
					minMax=max;
				}
			}
			
			return minMax;
			
			
		}
		catch(IOException e)
		{
			System.out.println("An error occured, File not found");
			return -1;
		}
		
		
	}
	
	public static void taskOne(int[] arr1, int k, int[] arr2, int m)
	{
		//Is arr1 < arr2?
		boolean isSmaller = true;
		
		//I iterates for k, and J iterates for m
		// (i=k) and (j=m)
		int i=0;
		int j=0;
		
		while(isSmaller && i<k)
		{
			
			
			while(isSmaller&&j<m)
			{
				//Is num of arr1 >= num of arr2?
				if(arr1[i]>=arr2[j])
				{
					isSmaller=false;
				}
				
				j++;
			}
			
			i++;
			j=0;
		}
		
		if(isSmaller)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		
	}

}
