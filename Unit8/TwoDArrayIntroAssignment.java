
public class TwoDArrayIntroAssignment {

	public static void main(String[] args) {
		
		//Task One
		int[][] emptyArr= new int[4][6];
		
		//Task Two
		int[][] nums= {{4,5,7},{2,-1,8},{0,1,3}};

		//Task Three
		emptyArr[0][0]=17;
		nums[0][0]=17;
		
		//Task Four
		emptyArr[1][2]=20;
		nums[1][2]=20;
		
		//Task Five
		emptyArr[0][emptyArr[0].length-1]=20;
		nums[0][nums[0].length-1]=20;
		
		//Task Six
		emptyArr[emptyArr.length-1][0]=-7;
		nums[nums.length-1][0]=-7;
		
		//Task Seven
		int emptyN=emptyArr.length-1;
		int numsN=nums.length-1;
		
		emptyArr[emptyN][emptyArr[emptyN].length-1]=-30;
		nums[numsN][nums[numsN].length-1]=-30;
		
		
	}

	/*
	 * Task Eight: Print elements in first row
	 */
	public static void printFirstRow(int[][]arr)
	{
		for(int i:arr[0])
		{
			System.out.print(i+" ");
		}
	}
	
	/*
	 * Task Nine: Prints elements in first column
	 */
	public static void printFirstColumn(int[][]arr)
	{
		for(int[] i:arr)
		{
			System.out.print(i[0]+" ");
		}
	}
	
	
	/*
	 * Task Ten: Prints contents of a 2d int array
	 */
	public static void printRowMajor(int[][]arr)
	{
		for(int[] n: arr)
		{
			for(int i:n)
			{
				//SOP(arr[i][l]);
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
	
	/*
	 * Prints the contents of a 2d in array in Column Major Order
	 */
	public static void printColumnMajor(int[][]arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			for(int[] j:arr)
			{
				//Print each element at i from array j; repeat n (or arr.length) times
				System.out.print(j[i]+" ");
			}
		}
	}
	
	
	
	
}
