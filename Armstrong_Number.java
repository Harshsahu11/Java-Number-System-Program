import java.util.*;
public class Armstrong_Number {
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=Sc.nextInt();
        int num=n;
        int d,cb,s=0;
        while(n>0)
        {
            d=n%10;
            cb=d*d*d;
            s=s+cb;
            n=n/10;
        }
        if(s==num){
            System.out.println("Armstrong Number");
        }
        
        else
        {
            System.out.println("Armstrong Number");
        }


    }
}
