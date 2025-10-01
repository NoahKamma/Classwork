//makeOutWord answer
public String makeOutWord(String out, String word) 
{
  return out.substring(0,2)+word+out.substring(2,4);
}

//firstTwo answer
public String firstTwo(String str) 
{
  
  if (str.length() > 2)
  {
        return str.substring(0,2);    
  }
  else
  {
      return str.substring(0,str.length());
  }

  
}

//extraEnd answer
public String extraEnd(String str) {
  String lastTwo = new String(str.substring(str.length()-2,str.length()));
  return lastTwo+lastTwo+lastTwo;
}

//withoutEnd
public String withoutEnd(String str) {
  
  int length = str.length();
  return str.substring(1,length-1);
  
}
