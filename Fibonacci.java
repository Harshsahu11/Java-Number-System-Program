import java.util.*;
public class Fibonacci {
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Number of Terms");
        int n=Sc.nextInt();
        int i;
        int f1=0,f2=1,f3;
        if(n==1)
        {
            System.out.print(f1);
        }
        else if(n==2)
        {
            System.out.print(f1+","+f2);
        }
        else if(n>2)
        {
            System.out.print(f1+","+f2+",");
            for(i=3;i<=n;i++)
            {
                f3=f1+f2;
                System.out.print(f3+",");
                f1=f2;
                f2=f3;
            }
        }
    }    
}
