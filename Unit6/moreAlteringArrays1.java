

public class moreAlteringArrays1 {
	
	// main class
    public static void main(String[] args)
    {
    	   	int arr[]= {-4,10,41,999,-45};
    	   
    }
    
    public static int[] noNegatives(int[] arr)
    {
    	int[] copyArr= new int[arr.length];
    	for(int i=0; i<arr.length-1;i++ )
    	{
    		copyArr[i] = java.lang.Math.max(0, arr[i]);
    	}
    	return copyArr;
    }
    
    public static int[] dropMethod(int[] arr)
    {
    	int[] copyArr=arr;
    	int leastElement=0;
    	int leastNum=arr[0];
    	
    	for(int i=1; i<arr.length-1;i++ )
    	{
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
