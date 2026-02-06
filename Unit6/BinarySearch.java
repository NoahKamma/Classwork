
public class BinarySearch {

	public static void main(String[] args) {
		int[]arr= {-1,0,1,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,67,9999};
		System.out.print(binarySearch(100000,arr));
	}
	
	public static int binarySearch(int target,int[] arr)
	{
		//Initialize variables
		int min=0;
		int max=arr.length-1;
		
		//Stop iteration when target is not present in array
		while(min<=max)
		{
			//Determine middle element (mid) and access it
			int mid= min+(max-min)/2;
			int curInt=arr[mid];
			
			//Ignore right side of array if target is less than mid
			if(target<curInt)
			{
				max=mid-1;
			}
			//Ignore left side of array if target is more than mid
			else if(target>curInt)
			{
				min=mid+1;
			}
			//Middle element equals mid; return it
			else
			{
				return mid;
			}
		}
		
		//Target is not present in array, return -1
		return -1;

	}
	

}
