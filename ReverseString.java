//WAP to print reverse case of a given string
class ReverseString
  {
    public static void main(String[] args)
    {
      String str="BITLABS";
     String strreverse=" ";
      for(int i=str.length()-1;i>=0;i--)
        {
          strreverse=strreverse+str.charAt(i);
        }
      System.out.println(strreverse);
    }
  }