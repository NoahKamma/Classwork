public int factorial(int n) {
  
  if(n==0)
  {
    return 1;
  }
  else
  {
    return n * factorial(n-1);
  }
  
}

public int bunnyEars(int bunnies) {
  
  if(bunnies==0)
  {
    return 0;
  }
  
  return 2+bunnyEars(bunnies-1);
  
  
}

public int fibonacci(int n) {
  
  if(n<=0)
  {
    return 0;
  }
  else if(n==1)
  {
    return n;
  }
  
  
  return fibonacci(n-1)+fibonacci(n-2);
}
