public int countHi(String str) {
  int total = 0;
  for(int i=0; i<str.length()-1; i++)
  {
    if(str.substring(i,i+2).equals("hi"))
    {
      total++;
    }
  }
  return total;
}

public boolean catDog(String str) {
  int cat=0;
  int dog=0;
  
  int index=3;
  
  if(str.length()>2)
  {
    while(!(index>str.length()))
    {
      if((str.substring(index-3,index)).equals("cat"))
      {
        cat++;
      }
      else if((str.substring(index-3,index)).equals("dog"))
      {
        dog++;
      }
      index++;
    }
  }
  else
  {
    return true;
  }
  
  if(cat==dog)
  {
    return true;
  }
  else
  {
    return false;
  } 
}

public int countCode(String str) {
  //Excluded index
  int eIndex = 4;
  int count =0;
  
  while(eIndex<=str.length())
  {
    if((str.substring(eIndex-4,eIndex-2)).equals("co")&&(str.substring(eIndex-1,eIndex)).equals("e"))
    {
      count++;
    }
    eIndex++;
  }
  
  return count;
}

public String repeatEnd(String str, int n) {
  
  //Total string and n represents iteration+substring amount
  String total = new String("");
  int num=n;
  
  for(int i=0; i<num; i++)
  {
    total = total + str.substring(str.length()-num,str.length());
  }
  
  return total;
  
  
  
}
