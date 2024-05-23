import java.util.*;
public class Reverse_Number {
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=Sc.nextInt();
        int rev=0;
        while (n>0) {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println("Reverse of Number = "+rev);
    }
}
