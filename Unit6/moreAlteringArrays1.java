

public class moreAlteringArrays1 {
	
	// main class
    public static void main(String[] args)
    {
    	   	int arr[]= {-4,10,41,999,-45};
    	   
    }

	/*
	*Return a copy of the passed array that has all negative numbers changed to zero
	*/
    public static int[] noNegatives(int[] arr)
    {
		//Initalize an empty int array
    	int[] copyArr= new int[arr.length];
		//Traverse the array's elements
    	for(int i=0; i<arr.length-1;i++ )
    	{
			//Determine with Math.max if the 
    		copyArr[i] = java.lang.Math.max(0, arr[i]);
    	}
    	return copyArr;
    }

	/*
	*Return a copy of the passed array that has its lowest number replaced with 0
	*/
    public static int[] dropMethod(int[] arr)
    {
		//Initalize an empty int array
    	int[] copyArr=arr;
		
		//Variables to keep track of which element has the lowest number and what the number is
		int leastElement=0;
    	int leastNum=arr[0];
    	
    	for(int i=1; i<arr.length-1;i++ )
    	{
			//If the iterated element is less than our current "lowest" number,
			//Update our variables to reflect the change in the what is the lowest number
    		if(arr[leastElement]>arr[i])
    		{
    			leastElement=i;
    			leastNum=arr[i];
    		}
    	}
    	copyArr[leastElement]=0;
    	
    	return copyArr;
    }

}
