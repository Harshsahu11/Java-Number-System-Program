import java.util.Scanner;
public class AnyBase_Addition {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n1=Sc.nextInt();
        System.out.println("Enter Second Number");
        int n2=Sc.nextInt();
        System.out.println("Enter Base");
        int b=Sc.nextInt();
        int result=add(n1,n2,b);
        System.out.println("Result = "+result);
    }
    public static int add(int n1,int n2,int b){
        int rev=0;
        int c=0;
        int p=1;
        while(n1>0 || n2>0 ||c>0){
            int d1=n1%10;
            int d2=n2%10;
            n1=n1/10;
            n2=n2/10;
            int d=d1+d2+c;
            c=d/b;
            d=d%b;
            rev+= d*p;
            p=p*10;
        }
        return rev;
    }
}
