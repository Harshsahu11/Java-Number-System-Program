import java.util.Scanner;

public class AnyBase_To_Decimal {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=Sc.nextInt();
        System.out.println("Enter Base");
        int Base=Sc.nextInt();
        int dn=getvalue(n,Base);
        System.out.println(dn);
    }
    public static int getvalue(int n,int b)
    {
        int c=0;
        int temp=0;
        while(n>0){
            int d=n%10;
             temp= temp+(int) (d*Math.pow(b,c));
            n=n/10;
            c++;
        }
        return temp;
    }
}
