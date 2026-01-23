public class AlteringArraysProblem.java {
  
    public static void main(String[] args)
    {
    	int[] nums = {-3,999,67,41};

      //Return the new array, by running our method into the copy array
    	int[] newNums= subtract5FromAll4(nums);

      //Print the array by traversing it
    	for(int i=0; i<newNums.length; i++)
    	{
    		System.out.println(newNums[i]);
    	}
    	
    }

  /*
  *Subtract 5 from all elements in the passed array and return that same array
  */
    public static int[] subtract5FromAll4(int[] nums)
    {
    	for(int i=0; i<nums.length-1; i++)
    	{
    		nums[i]-=5;
    	}
    	return nums;
    }
}
