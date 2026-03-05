

public class TwoDArraySorter {
	
	public static void main(String[] args) {
		
		int[][] arr={
					{1,5},
					{3,2},
					{9,8},
					{4,0}
					};
			

		
		sort(arr);
		
		for(int[] i:arr)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}
	
	public static void sort(int[][] arr)
	{
		int n= arr.length * arr[0].length;
		
		//All elements lesser than arr[firstI][firstJ] are "sorted"
		double firstI=0.0;
		int firstJ=0;
		
		for(int k=0;k<n;k++)
		{
			//First unsorted element becomes default min
			// +(1/arr[0].length) == increment from sortedI by one
			// sortedJ+1%arr[0].length == increment from sortedJ by by one 
			
			int minI=(int)firstI;
			int minJ=firstJ;
			
			
			for(int i= (int) firstI; i<arr.length; i++)
			{
				for(int j=firstJ;j<arr[0].length;j++)
				{
					//If current min > accessed element
					if(arr[minI][minJ]>arr[i][j])
					{
						//Make element new min
						minI=i;
						minJ=j;
					}
				}
			}
			
			int temp=arr[(int)firstI][firstJ];
			arr[(int)firstI][firstJ]=arr[minI][minJ];
			arr[minI][minJ]=temp;
			
			//Increment by 1 for every sorted row
			firstI+=  1.0/arr[0].length;
			//Return to 0 when k>=arr[0].length
			firstJ=(k+1)%arr[0].length;
			
					
		}
		
	}

}
