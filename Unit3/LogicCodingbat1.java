/*
* cigarParty
*/
public boolean cigarParty(int cigars, boolean isWeekend) {
  if(isWeekend == true && cigars>=40)
  {
    return true;
  }
  else
  {
    if (cigars>=40 && cigars<=60)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}

/*
* dateFashion
*/
public int dateFashion(int you, int date) {
if(you<=2 || date<=2)
{
  return 0;
}
else
  {
  if(you>=8 || date>=8)
    {
     return 2;
    }
    else
    {
      return 1;
   }
  }
}

/*
*squirrelPlay
*/
public boolean squirrelPlay(int temp, boolean isSummer) {

  if(isSummer==true)
  {
    if(temp>=60 && temp<=100)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  else
  {
    if(temp>=60 && temp<=90)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

}

//caughtSpeeding
public int caughtSpeeding(int speed, boolean isBirthday) {
  if(isBirthday == true)
  {
    if(speed>=86)
    {
      return 2;
    }
    else
    {
      if(speed<=65)
      {
        return 0;
      }
      else
      {
        return 1;
      }
    }
  }
  else
  {
    if(speed>=81)
    {
      return 2;
    }
    else
    {
      if(speed<=60)
      {
        return 0;
      }
      else
      {
        return 1;
      }
    }
  }
  
}

//sortaSum
public int sortaSum(int a, int b) {
  if(a+b>=10 && a+b<=20)
    {
      return 20;
    }
    else
    {
      return a+b;
    }
}
