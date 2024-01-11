import java.util.*;
public class Prime 
{
    public static void main(String[] args) 
    {
        int n, i, c = 0;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        n = Sc.nextInt();
        for (i = 2; i < n; i++) 
        {
            if (n % i == 0)
                c++;
        }
        if (c == 0)
            System.out.println("Prime Number " + n);
        else
            System.out.println("Not Prime Number " + n);
    }
}
