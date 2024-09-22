import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=Sc.nextInt();
        int rev=0;
        while(num>0)
        {
            int d=num%10;
            rev=rev*10+d;
            num=num/10;
        }
        System.out.println("Reversed Number = "+rev);
    }
}
