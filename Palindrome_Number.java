import java.util.*;
public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=Sc.nextInt();
        int num=n;
        int d;
        int rev=0;
        while(n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(rev==num)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not Palindrome Number");
        }
    }
}
