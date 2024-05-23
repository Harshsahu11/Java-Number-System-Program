import java.util.*;
public class Even_or_Odd {
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=Sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Even "+n);
        }
        else
        {
            System.out.println("Odd "+n);
        }
    }
}
