public int[] rotateLeft3(int[] nums) {

int[] newNums= new int[3];
for(int i=0; i<3;i++)
  {
    newNums[i]=nums[(i+1)%3];
  }
 
 return newNums;
}

public int[] reverse3(int[] nums) {
  int[] newNums= new int[3];
  
  for(int i=0; i<3; i++)
  {
    newNums[i]=nums[2-i];
  }
  
  return newNums;
}

public int[] maxEnd3(int[] nums) {
 int larger;
  if(nums[0]>nums[2])
  {
    larger=nums[0];
  }
  else
  {
    larger=nums[2];
  }
  
  for(int i=0;i<3;i++)
  {
    nums[i]=larger;
  }
  
  return nums;
  
  
}

public int sum2(int[] nums) {
  int total=0;
 for(int i=0; i<2 && i<nums.length ; i++)
 {
   total+=nums[i];
 }
 return total;
  
}

public int[] middleWay(int[] a, int[] b) {
  int[] newArr= {a[1],b[1]};
  return newArr;
}

public int[] makeEnds(int[] nums) {
  int[] newArr = {nums[0],nums[nums.length-1]};
  return newArr;
}

