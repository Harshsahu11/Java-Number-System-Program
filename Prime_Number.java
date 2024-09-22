import java.util.Scanner;
public class Prime_Number {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=Sc.nextInt();
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0) {
                c++;
                break;
            }
        }
        if(c==0)
        {
            System.out.println(n+" is a Prime Number");
        }
        else
        {
            System.out.println(n+" is not a Prime Number");
        }
    }
}
