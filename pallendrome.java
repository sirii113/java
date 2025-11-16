import java.util.Scanner;
class pallendrome
{
    public static void main(String[] args)
    {
        Scanner myObj =new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=myObj.nextInt();
        int original=n ; // Store the original number for comparison
        int rev = 0;
        int remainder;
        while(n!=0)
        {
            remainder=n%10;
            rev=rev*10+remainder;
            n=n/10;
        }
        if(original==rev)
        {
            System.out.println(original+"is a pallimdrome");
        }
        else
        {
            System.out.println(original+"is not");
        }
    }
}
