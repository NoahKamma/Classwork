

public class Snippets1 {
	
	// main class
    public static void main(String[] args)
    {
    	   	int[] arr= {-2345,2,0,65,9999,123,-999};
    	   	int[] sortedArr= bubbleSort(arr);
    	   	
    	   	for(int i=0; i<arr.length;i++)
    	   	{
    	   		System.out.println(sortedArr[i]);
    	   	}
    	   	
    }

    /*
    *Utilizes the bubble sort algorithim to sort ints in an array from least to greatest
    */
    public static int[] bubbleSort(int[] arr)
    {
      //Initialize variables
    	boolean isSorted=false;
    	int temp;

      //For every iteration of the first loop, traverse the array and find any ints out of order
      //Will iterate until every int is in numerical order in a single traversed iteration(each int is greater than the last)
    	while(!isSorted)
    	{
    	isSorted=true;
    		for(int i=0; i<arr.length-1; i++)
    		{
          //If true, use temp variable to swap the ints without losing the original numbers
          //-and have another loop traverse array to check if it is now sorted
    			if(arr[i]>arr[i+1])
    			{
    				isSorted=false;
    				
    				temp=arr[i];
    				arr[i]=arr[i+1];
    				arr[i+1]=temp;
    			}
    		}
    	}	
      //Return when sorting is complete
    	return arr;
    }
}
