import java.util.Scanner;
class reverse
  {
    public static void main(String[] args)
    {
      Scanner myObj=new Scanner(System.in);
      System.out.println("enter the value of n");
      int n=myObj.nextInt();
      int rev=0;
      while(n!=0)
      {
          int remainder=n%10;
          rev=rev*10+remainder;
          n=n/10;
       }
      System.out.println("reversed of"+n+"is"+rev);
    }
   }
   
