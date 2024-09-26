import java.util.Scanner;

public class AnyBase_to_Anybase {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=Sc.nextInt();
        System.out.println("Enter Base");
        int Base1=Sc.nextInt();
        int Base2=Sc.nextInt();
        int dn=getvalue(n,Base1,Base2);
        System.out.println(dn);
    }
    public static int getvalue(int n,int b1,int b2){
            int dec=decimal(n,b1);
            int dne=anybase(dec,b2);
            return dne;
    }
    public static int decimal(int n,int b){
        int rev=0;
        int p=1;
        while(n>0){
            int d=n%b;
            n=n/b;
            rev+=d*p;
            p=p*10;

        }
        return rev;
    }
    public static int anybase(int n,int b)
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
