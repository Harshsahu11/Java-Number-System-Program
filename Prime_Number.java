import java.util.*;
public class Prime_Number {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=Sc.nextInt();
        int c=0;
        int i;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==0)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not Prime Number");
        }
    }
}
