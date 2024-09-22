import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=Sc.nextInt();
        int c=0;
        while(n>0)
        {
            c++;
            n=n/10;
        }
        System.out.println("Number of Digits in Number = "+c);
    }
}
