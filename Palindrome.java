import java.util.*;
class Palindrome
{
    public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=Sc.nextInt();
        int rev=0;
        int N=n;
        while(n>0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(rev==N)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");  
        }    
    }
}