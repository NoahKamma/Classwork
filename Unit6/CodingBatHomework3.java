public boolean has23(int[] nums) {
 
  boolean hasNum=false;
 
  for(int i:nums)
  {
    if(i==2||i==3)
    {
      hasNum=true;
    }
  }
  
  return hasNum;
  
  
}

public boolean no23(int[] nums) {
 boolean noNum=true;
 
  for(int i:nums)
  {
    if(i==2||i==3)
    {
      noNum=false;
    }
  }
  return noNum;
  
}

public int[] makeLast(int[] nums) {
  
  int[] arr= new int[nums.length*2];
  
  arr [arr.length-1]= nums[nums.length-1];
  return arr;
}

public boolean double23(int[] nums) {
  
  int count=0;
  
  for(int i:nums)
  {
   count+=i;
  }
  
  boolean isTwice= (count==4||count==6);
  return isTwice;
  
}

public int[] fix23(int[] nums) {
  
  int[] arr=nums;
  
  for(int i=0; i<2; i++)
  {
    if( arr[i]==2 && arr[i+1]==3  )
    {
      arr[i+1]=0;
    }
  }
  
  return arr;
  
}

public int start1(int[] a, int[] b) {
  int count=0;
  
  if(a.length!=0){
  count+=Math.abs((1%a[0])-1 );
  }
  if(b.length!=0){
 count+=Math.abs((1%b[0])-1 );
  }
  
  return count;
  
}

public int[] biggerTwo(int[] a, int[] b) {
  
  int sum=0;
  
  for(int i:a)
  {
    sum+=i;
  }
  
  for(int i:b)
  {
    sum-=Math.abs(i);
  }
  
  if(sum>=0)
  {
    return a;
  }
  else
  {
    return b;
  }
  
}

public int[] makeMiddle(int[] nums) {
  int halfWay=nums.length/2;
  int[] copyArr= {nums[halfWay-1],nums[halfWay]};
  
  return copyArr;
  
}

public int[] plusTwo(int[] a, int[] b) {
  int[] copyArr={a[0],a[1],b[0],b[1],};
  return copyArr;
}

public int[] swapEnds(int[] nums) {
int fIn=nums[0];
int lIn=nums[nums.length-1];
nums[0]=lIn;
nums[nums.length-1]=fIn;

return nums;
}

public int[] midThree(int[] nums) {
  int copyArr[]= new int[3];
  int halfWay=nums.length/2-1;
  
  for(int i=0;i<3; i++)
  {
    copyArr[i]=nums[halfWay+i];
  }
  
  return copyArr;
}

public int maxTriple(int[] nums) {
  int length=nums.length;
  return Math.max(nums[0],Math.max(nums[length/2],nums[length-1]));
}

public int[] frontPiece(int[] nums) {
  int length = Math.min(nums.length,2);
  int[] copyArr= new int[length];
  
  for(int i=0;i<length;i++ )
  {
    copyArr[i]=nums[i];
  }
  
  return copyArr;
}

public boolean unlucky1(int[] nums) {
 
 boolean isUnlucky=false;
 int mod=1;
 
 for(int i=1;i<nums.length; i+=1+1*(4%mod)*(nums.length-4))
   {
     
      if(nums[i-1]+nums[i]==4 && nums[i-1]-nums[i]==-2  )
      {
         isUnlucky=true;
      }
      mod++;
   }

  return isUnlucky;
}

public int[] make2(int[] a, int[] b) {
  int[] copyArr= new int[2];
  int i=0;
  while(i<Math.min(2,a.length))
  {
    copyArr[i]=a[i];
    i++;
  }
  
  for(int leftOv=0; leftOv<(2-i);leftOv++)
  {
    copyArr[i+leftOv]=b[leftOv];
    
  }
  
  return copyArr;

}

public int[] front11(int[] a, int[] b) {
  
  int aAmount=1%(a.length+1);
  int bAmount=1%(b.length+1);
  int element=0;
  
  int[] copyArr=new int[aAmount+bAmount];
  
  if(aAmount>0)
  {
    copyArr[element]=a[0];
    element++;
  }
  
  if(bAmount>0)
  {
    copyArr[element]=b[0];
    element++;
  }
  
  return copyArr;
}
