
public class SearchingArraysIntro {

	public static void main(String[] args) {
		

	}
	
	/*
	 * Return an boolean based on if the passed array has a 4
	 */
	public static boolean checkFor4(int[] arr)
	{
		boolean hasFour = false;
		
		//Set hasFour to true whenever an element with 4 is present
		for(int num:arr)
		{
			if(num==4)
			{
				hasFour=true;
			}
		}
		
		return hasFour;
	}
	
	/*
	 * Return the int amount of times that 4 appears in passed array
	 */
	public static int countFor4(int[] arr)
	{
		int count=0;
		
		//Add to count, which will be returned, with every instance of 4 in an element
		for(int num:arr)
		{
			if(num==4)
			{
				count++;
			}
		}
		
		return count;
	}
	
	/*
	 * Return a boolean if the array exactly has four 4s
	 */
	public static boolean checkForFour4(int[] arr)
	{
		//hasFour4s set to true if count equals 4
		//Count represents number of 4s in arr
		int count=0;
		boolean hasFour4s= (count==4);
		
		//Add to count for every instance of 4 in arr
		for(int num:arr)
		{
			if(num==4)
			{
				count++;
			}
		}
		
		return hasFour4s;
	}

}
