import java.util.*;
public class Product_Of_digits {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=Sc.nextInt();
        int product = 1;
        if(n==0)
        {
            System.out.println("Product : "+0);
        }
        else{
            while(n>0)
            {
                int d=n%10;
                product=product*d;
                n=n/10;

            }
                System.out.println("Product : "+product);
        }

    }
}
