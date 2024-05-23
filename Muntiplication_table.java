import java.util.*;
public class Muntiplication_table
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=Sc.nextInt();
        int i;
        int f;
        for(i=1;i<=10;i++)
        {
            f=n*i;
            System.out.println(n+"*"+i+"="+f);
        }
    }
}