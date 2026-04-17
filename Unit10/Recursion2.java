public int triangle(int rows) {
  
  if(rows==0)
  {
    return 0;
  }
  else
  {
    return rows+triangle(rows-1);
  }
}

public int sumDigits(int n) {

  
  if(n==0)
  {
    return 0;
  }
  else
  {
    int sum= n%10;
    return sum+sumDigits(n/10);
  }
}

public int powerN(int base, int n) {
  if(n==0)
  {
    return 1;
  }
  else
  {
    return base*powerN(base,n-1);
  }
}
