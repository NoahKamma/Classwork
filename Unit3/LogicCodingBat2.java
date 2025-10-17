//alarmClock
public String alarmClock(int day, boolean vacation) {
  if(vacation == true)
    {
      if(day==0 || day==6)
        {
          return "off";
        }
      else
        {
          return "10:00";
        }
    }
  else
    {
      if(day==0 || day==6)
        {
          return "10:00";
        }
      else
        {
          return "7:00";
        }
    }
}


//in1To10
public boolean in1To10(int n, boolean outsideMode) {
  if (outsideMode == true)
  {
    if(n<=1)
    {
      return true;
    }
    else if (n>=10)
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
    if(n>=1 && n<=10)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}

//old35
public boolean old35(int n) {
  if(n%3==0 && n%5==0)
  {
    return false;
  }
  else
  {
    if(n%3==0)
    {
      return true;
    }
    else if(n%5==0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}
