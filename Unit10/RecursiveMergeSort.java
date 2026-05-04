
public class RecursiveMergeSort {

	public static void main(String[] args) {
		
		int[] arr = new int[10000];
		
		for(int i=0;i<10000;i++)
		{
			arr[i]=(int)(10000*java.lang.Math.random());
		}
		
		mergeSort(0,arr.length-1,arr);
		
		for(int i=0; i<10000;i++)
		{
			System.out.println(arr[i]);
		}

	}
	
	/*
	 * Sorts by:
	 * successively dividing the passed array into two halves, (from two halves, four, eighht, etc.)
	 * before successively merging the halves into sorted order.
	 */
	public static void mergeSort(int l, int r, int[]arr)
	{
		//Keep dividing until the halved size is one element
		if(l<r)
		{
			//Create two halves by splitting the array in the middle.
			int m=l+(r-l)/2;
			
			mergeSort(l,m,arr);
			mergeSort(m+1,r,arr);
			
			//Merge each half, starting from the smallest halves, to the complete array
			merge(l,m,r,arr);
		}
	}
	
	/*
	 * The merge and sort logic of mergeSort. Sorts all of the elements from the two halves
	 * of the array/sub-array, within the actual parameters of index l and r.
	 */
	public static void merge(int l, int m, int r, int[]arr)
	{
		//The sizes of the two subarrays
		int n1=m-l+1, n2=r-m;
		
		//Temp subarray containers to traverse
		int[] lArr= new int[n1];
		int[] rArr= new int[n2];
		
		
		//Copy ints into the temp arrays
		for(int i=0;i<n1;i++)
		{
			lArr[i]=arr[l+i];
		}
		for(int i=0;i<n2;i++)
		{
			rArr[i]=arr[m+1+i];
		}
		
		//Initial, individual indexes of subarrays before traversal
		int i=0;
		int j=0;
		
		//Initial index of the merged array witin the actual array
		int k=l;
		
		while(i<n1 && j<n2)
		{
			//Copy the lesser int of the checked indexes of the right and left subarrays
			//Traverse the arr & subarrays until all "unsorted elements" are sorted into arr
			if (lArr[i] <= rArr[j]) 
			{

                arr[k] = lArr[i];
                i++;
            }
            else 
            {
            	
                arr[k] = rArr[j];
                j++;
            }
            k++;
		}
		
		//From the left to the right half, copy the remaining elements that
		//are already in sorted order, if any
        while (i < n1) 
        {
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while (j < n2) 
        {
            arr[k] = rArr[j];
            j++;
            k++;
        }
		
	}
	


}
