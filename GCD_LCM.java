import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter two Number");
        int n1=Sc.nextInt();
        int n2=Sc.nextInt();
        int o1=n1;
        int o2=n2;
        while(n1%n2!=0)
        {
            int rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        int GCD=n2;
        int LCM=(o1*o2)/GCD;
        System.out.println("GCD = "+GCD);
        System.out.println("LCM = "+LCM);
    }
}
