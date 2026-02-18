

public class AlgorithimsProject {

	public static void main(String[] args) {
		
		int[] arr1= {-23548656,-9999,-1234,-1,0,0,0,5,19,27,67,5,5,567,68,100,
					123,231,432,455,799,5,5,1201,9999,102315,99999999,5,5};
		int[] arr2= {0,1,2,3,4,5,6,7,8,9};
		
		int[] arr3= new int[10000];
		for(int i=0;i<arr3.length;i++)
		{
			arr3[i]= (int) (100000*java.lang.Math.random());
		}
		
		int start = (int)System.currentTimeMillis();
		quickSort(arr3,0,arr3.length-1);
		int end = (int)System.currentTimeMillis();
		System.out.print(end-start);
		
	}
	
	/*
	 * Returns the smallest int in an array
	 */
	public static int getLeastNum(int[] arr)
	{
		int least=arr[0];
		for(int i:arr)
		{
			//Compare current least int with int in element i
			if(i<least)
			{
				least=i;
			}
		}
		
		return least;
	}
	
	/*
	 * Returns the index of the smallest int in an array
	 */
	public static int getLeastNumIn(int[] arr)
	{
		int least=arr[0];
		int in=0;
		for(int i=0;i<arr.length;i++)
		{
			//Compare current least int with int in element i
			if(arr[i]<least)
			{
				in=i;
			}
		}
		
		return in;
	}
	
	/*
	 * Returns the average of an array
	 */
	public static int getAverage(int[] arr)
	{
		int total=0;
		for(int i:arr)
		{
			total+=i;
		}
		
		return total/arr.length;
	}
	
	/*
	 * Returns a boolean on if the array contains all even ints
	 */
	public static boolean isAllEven(int[] arr)
	{
		boolean isEven=true;
		int n=arr.length-1;
		
		while(isEven&&n>=0)
		{
			//Check if each int is even. Exit iteration early if odd found
			if(!(arr[n]%2==0))
			{
				isEven=false;
			}
			n--;
		}
		
		return isEven;
		
		
	}
	
	/*
	 * Changes instances of two consecutive 5's in an array and returns it
	 */
	public static int[] zeroConsFives(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			//Change to 0 whenever element i and i-1 equals five
			if(arr[i]==5&&arr[i-1]==5)
			{
				arr[i]=0;
				arr[i-1]=0;
			}
		}
		
		return arr;
	}
	
	/*
	 * Returns a boolean on if any number shows up three times on the passed array
	 */
	public static boolean hasTripleNum(int[] arr)
	{
		boolean hasTriple=false;
		int n=arr.length-1;
		
		while(!hasTriple && n>=2)
		{
			//Whenever elements n-1 and n-2 contains num, exit iteration and return true
			int num=arr[n];
			
			if(arr[n-1]==num && arr[n-2]==num)
			{
				hasTriple=true;
			}
			n--;
		}
		
		
		return hasTriple;
		
	}
	
	/*
	 * Returns an int on the numbers of instances the passed int occurs in the passed array
	 */
	public static int numInstances(int[] arr,int num)
	{
		int count=0;
		for(int i:arr)
		{
			if(i==num)
			{
				count++;
			}
		}
		
		return count;
	}
	
	/*
	 * Returns the passed array in reverse order
	 */
	public static int[] reverseOrder(int[] arr)
	{
		int n=arr.length;
		for(int i=0; i<n/2;i++)
		{
		//Swap i and its inverse
			
			int temp=arr[i];
			//Math.getAbs(i-(arr.length-1))
			int inverse=-1*(i-(n-1));
			arr[i]=arr[inverse];
			arr[inverse]=temp;
		}
		
		return arr;
	}
	
	/*
	 * Shifts all elements in the passed array to the right
	 */
	public static int[] shiftRight(int[] arr)
	{
		int n=arr.length;
		int nextTemp=arr[0];
		int currTemp;
		
	
		for(int i=0;i<n+1;i++)
		{
			//Refer to the "next" element to be changed
			int nextIn=i%n;
			
			//Previously stored temp becomes the replacement num this iteration
			currTemp=nextTemp;
			//Element nextIn is stored for next iteration
			nextTemp=arr[nextIn];
			//Replace int at element nextIn with currTemp
			arr[nextIn]=currTemp;
		}
		return arr;
	}
	
	/*
	 * Sort the array with quick sort
	 */
	public static void quickSort(int[]arr, int low, int high)
	{
		if(low<high)
		{
			//Partitioning index is initialized
			int p=partition(arr,low,high);
			
			//Repeat process in smaller halves until low>=high
			quickSort(arr,low,p);
			quickSort(arr,p+1,high);
		}
	}
	
	/*
	 * Partitioning for quick sort
	 */
	public static int partition(int[] arr,int low, int high)
	{
		//Set our pivots and pointers according to passed ints
		int pivot=arr[low];
		
		int i=low-1; 
		int j=high+1;
		
		//Goal: look for numbers out of order according to pivot 
		//(Greater nums at left side of pivot, lesser nums at right side of pivot)
		while(true)
		{
			do
			{
				//Increment and find element >=pivot
				i++;
			}
			while(arr[i]<pivot);
			
			
			do
			{
				//Find and fine element <=pivot
				j--;
			}
			while(arr[j]>pivot);
			
			//Return when pointers meet or pass due to incrementation
			if(i>=j)
			{
				//Index j serves as partitioning index, dividing array into smaller halves
				return j;
			}
				
			//Swap i and j when return conditions are not met
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	
	}
	
	
	
}
