class Pod
  {
    public static void main(String[] args)
    {
      int n=456;
      int product=1;
      while(n!=0)
        {
          int temp=n%10;   
          product=product*temp;
          n=n/10;
        }
      System.out.println(product);
      }
  }