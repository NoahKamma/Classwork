public class AlteringArraysProblem.java {
  
    public static void main(String[] args)
    {
    	int[] nums = {-3,999,67,41};
    	
    	int[] newNums= subtract5FromAll4(nums);
    	
    	for(int i=0; i<newNums.length; i++)
    	{
    		System.out.println(newNums[i]);
    	}
    	
    }
    
    public static int[] subtract5FromAll4(int[] nums)
    {
    	for(int i=0; i<nums.length-1; i++)
    	{
    		nums[i]-=5;
    	}
    	return nums;
    }
}
