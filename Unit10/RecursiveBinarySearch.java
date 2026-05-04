
public class RecursiveBinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {-1,0,1,3,4,10,11,15,99,1000};
		
		System.out.print("It returns: "+binarySearch(99,0,arr.length-1,arr));

	}
	
	/*
	 * Return the index of int target within arr. 
	 * Returns -1 if it is not present within arr.
	 * 
	 * Uses a tail recursion version of binary search, 
	 * must pass most left and right index of arr
	 */
	public static int binarySearch(int target, int l, int r,int[]arr)
	{
		//The middle index of the current array section & its contained int
		int mIn=l+(r-l)/2;
		int mNum = arr[mIn];
		
		//Return -1 when the possible last index (or m) does not contain target
		if(l<=r)
		{
			//Return the index of m
			if(mNum==target)
			{
				return mIn;
			}
			else
			{
				if(target>mNum)
				{
					//The target is greater than index of m. Ignore the left side.
					return binarySearch(target,mIn+1,r,arr);
				}
				else
				{
					//The target is less than index of m. Ignore the right side.
					return binarySearch(target,l,mIn-1,arr);
				}
				
			}
		}
		
		return -1;
	}
	
	

}
