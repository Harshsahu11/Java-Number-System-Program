import java.util.Scanner;

public class Fibonacci_Number {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Terms");
        int n=Sc.nextInt();
        int f1=0;
        int f2=1;
        if(n==1)
            System.out.print(f1);
        else if(n==2)
            System.out.println(f2);
        else if (n>2)
        {
            System.out.print(f1+" "+f2+" ");
            for(int i=3;i<=n;i++)
            {
                int f3=f1+f2;
                System.out.print(f3+" ");
                f1=f2;
                f2=f3;
            }

        }
    }
}
