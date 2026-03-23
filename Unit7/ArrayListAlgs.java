import java.util.ArrayList;


public class ArrayListAlgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		
		for(int i=0; i<20;i++)
		{
			int random = (int)(10000*java.lang.Math.random());
			arr1.add(random);
		}
		
		for(int i=0; i<10;i++)
		{
			int random = (int)(3*java.lang.Math.random()+3);
			arr2.add(random);
		}
		
		
		System.out.println(arr2);
		ridAllFives(arr2);
		System.out.println(arr2);
		
		
		bubbleSort(arr1);
		System.out.println(arr1);
		
		
		
	}
	
	/*
	 * Returns the index of the first 4 within passed Array List, 
	 * return -1 when a 4 is not found
	 */
	public static int checkFor4(ArrayList<Integer> arr)
	{
		
		//Default to -1 whenever 4 is absent within arr
		int num=-1;
		
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i)==4)
			{
				//Set num to i of int 4 during if found during traversal
				num=i;
				break;
			}
		}
		
		return num;
	}
	
	/*
	 * Remove all instances of 5 from passed array
	 */
	public static void ridAllFives(ArrayList<Integer> arr)
	{
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i)==5)
			{
				//Remove element i and account for the change in index whenever a 5 is found
				arr.remove(i);
				i--;
			}
		}
	}
	
	/*
	 * Sort the passed array list using the bubble sort alg
	 */
	public static void bubbleSort(ArrayList<Integer> arr)
	{
		boolean sorted;
		
		do
		{
			sorted=true;
			
			for(int i=1;i<arr.size();i++)
			{
				if(arr.get(i-1)>arr.get(i))
				{
					//Swap the iterated elements i-1 and i whenever not in order
					//Iterate until sorted
					sorted=false;
					
					int a=i-1;
					int b=i;
					
					//Swap elements i-1 and i
					int temp =arr.get(a);
					arr.set(a, arr.get(b));
					arr.set(b, temp);
					
				}
			}
		}
		while(!sorted);
	}

}
