import java.util.*;
public class Int_To_Binary {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=Sc.nextInt();
        int rev=0;
        while(n>0)
        {
            int d=n%2;
            rev=rev*10+d;
            n=n/2;
        }
        System.out.println("Binary : "+rev);

    }
}
