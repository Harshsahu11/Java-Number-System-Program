import java.util.Scanner;

public class Inverse_of_Number {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=Sc.nextInt();
        int inv=0;
        int op=1;               //original position
        while(n!=0)
        {
            int od=n%10;        // original digit
            int id=op;
            int ip=od;

            // Make change to inv using ip and id
            inv=inv+id*(int)Math.pow(10,ip-1);

            n=n/10;
            op++;

        }
        System.out.println(inv);
    }
}
