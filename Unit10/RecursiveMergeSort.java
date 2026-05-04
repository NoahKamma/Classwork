
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
	
	
	public static void mergeSort(int l, int r, int[]arr)
	{
		if(l<r)
		{
			int m=l+(r-l)/2;
			
			mergeSort(l,m,arr);
			mergeSort(m+1,r,arr);
			
			merge(l,m,r,arr);
		}
	}
	
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
			//Traverse the arr & subarrays until all 
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
		
		//Copy the leftover ints of the left arr
        while (i < n1) 
        {
            arr[k] = lArr[i];
            i++;
            k++;
        }

        //Copy the leftover ints of the right arr
        while (j < n2) 
        {
            arr[k] = rArr[j];
            j++;
            k++;
        }
		
	}
	


}
