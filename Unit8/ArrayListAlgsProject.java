import java.util.ArrayList;

public class ArrayListAlgsProject {

public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<100;i++)
		{
			int random = (int)(101*java.lang.Math.random());
			arr.add(random);
		}
		
		int start = (int)System.currentTimeMillis();
		quickSort(arr,0,arr.size()-1);
		int end = (int)System.currentTimeMillis();
		System.out.print(end-start);
		
	}
	
	/*
	 * Returns the smallest int in an array
	 */
	public static int getLeastNum(ArrayList<Integer> arr)
	{
		int least = arr.get(0);
		for(int i:arr)
		{
			if(i<least)
			{
				//Traverse n times to find least int
				least=i;
			}
		}
		
		return least;
	}
	
	/*
	 * Returns the index of the smallest int in an array
	 */
	public static int getLeastNumIn(ArrayList<Integer> arr)
	{
		int least=arr.get(0);
		int in=0;
		int size=arr.size();
		
		for(int i=0;i<size;i++)
		{
			//Compare current least int with int in element i
			if(arr.get(i)<least)
			{
				in=i;
			}
		}
		
		return in;
	}
	
	/*
	 * Returns the average of an array
	 */
	public static int getAverage(ArrayList<Integer> arr)
	{
		int total=0;
		for(int i:arr)
		{
			total+=i;
		}
		
		// Sum of arr / size of arr = average
		return total/arr.size();
	}
	
	/*
	 * Returns a boolean on if the array contains all even ints
	 */
	public static boolean isAllEven(ArrayList<Integer> arr)
	{
		boolean isEven=true;
		int n=arr.size()-1;
		
		while(isEven&&n>=0)
		{
			//Check if each int is even. Exit iteration early if odd found
			if(!(arr.get(n)%2==0))
			{
				isEven=false;
			}
			n--;
		}
		
		return isEven;
		
		
	}
	
	/*
	 * Changes instances of two consecutive 5's into 0 in an array and returns it
	 */
	public static ArrayList<Integer> zeroConsFives(ArrayList<Integer> arr)
	{
		int size=arr.size();
		
		for(int i=1;i<size;i++)
		{
			//Change to 0 whenever element i and i-1 equals five
			if(arr.get(i).equals(5)&&arr.get(i-1).equals(5))
			{
				arr.set(i, 0);
				arr.set(i-1, 0);
			}
		}
		
		return arr;
	}
	
	/*
	 * Returns a boolean on if any number shows up three times on the passed array
	 */
	public static boolean hasTripleNum(ArrayList<Integer> arr)
	{
		boolean hasTriple=false;
		int n=arr.size();
		
		for(int i=2;i<n;i++)
		{
			int num=i-2;
			
			if(arr.get(i-1).equals(num) &&
			   arr.get(i).equals(num))
			{
				//n, n-1, n-2 are all equal
				hasTriple=true;
			}
		}
		
		
		return hasTriple;
		
	}
	
	/*
	 * Returns an int on the numbers of instances the passed int occurs in the passed array
	 */
	public static int numInstances(int num,ArrayList<Integer> arr)
	{
		int count=0;
		for(int i:arr)
		{
			if(i==num)
			{
				//Increment count per iteration of i==num
				count++;
			}
		}
		
		return count;
	}
	
	/*
	 * Returns the passed array in reverse order
	 */
	public static ArrayList<Integer> reverseOrder(ArrayList<Integer> arr)
	{
		ArrayList<Integer> reversedArr = new ArrayList<Integer>();
		
		int n=arr.size();
		for(int i=0; i<n;i++)
		{
			//Add the inverse of i to reverseArr per iteration
			reversedArr.add(-1*(i-(n-1)));
		}
		
		return reversedArr;
	}
	
	/*
	 * Shifts all elements in the passed array to the right
	 */
	public static void shiftRight(ArrayList<Integer> arr)
	{
		int n=arr.size()-1;
		int num=arr.get(n);
		
		arr.remove(n);
		arr.add(0,num);
	}
	
	/*
	 * Sort the array with quick sort
	 * Note: always low=0 and high=length-1
	 */
	public static void quickSort(ArrayList<Integer> arr, int low, int high)
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
	public static int partition(ArrayList<Integer> arr,int low, int high)
	{
		//Set our pivots and pointers according to passed ints
		int pivot=arr.get(low);
		
		int i=low-1; 
		int j=high+1;
		
		//Goal: look for numbers out of order according to pivot 
		//(Greater nums at left side of pivot, lesser nums at right side of pivot)
		while(true)
		{
			do
			{
				//Find element >=pivot
				i++;
			}
			while(arr.get(i)<pivot);
			
			
			do
			{
				//Find element <=pivot
				j--;
			}
			while(arr.get(i)>pivot);
			
			//Return when pointers meet or pass due to incrementation
			if(i>=j)
			{
				//Index j serves as partitioning index, dividing array into smaller halves
				return j;
			}
				
			//Swap i and j when return conditions are not met
			int temp=arr.get(i);
			arr.set(i, arr.get(j));
			arr.set(j, temp);
		}
	
	}
	
}
