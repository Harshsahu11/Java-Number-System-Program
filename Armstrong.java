import java.util.*;
class Armstrong
{
    public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=Sc.nextInt();
        int s=0,Num=n;
        while(n>0)
        {
            int d=n%10;
            int sq=d*d*d;
            s+=sq;
            n=n/10;
        }
        if(s==Num)
        System.out.println("Armstrong Number");
        else
        System.out.println("Not Armstrong Number");
        }
}