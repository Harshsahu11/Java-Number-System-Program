import java.util.Scanner;
public class Decimal_to_anyBase
{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=Sc.nextInt();
        System.out.println("Enter Base");
        int Base=Sc.nextInt();
       int dn=getvalue(n,Base);
        System.out.println(dn);
    }
    public static int getvalue(int N,int b){
        int rev=0;
        int p=1;
        while(N>0){
            int d=N%b;
            N=N/b;
           rev+=d*p;
           p=p*10;

        }
        return rev;
    }
}
