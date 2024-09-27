import java.util.Scanner;

public class AnyBase_Multiplication {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n1=Sc.nextInt();
        System.out.println("Enter Second Number");
        int n2=Sc.nextInt();
        System.out.println("Enter Base");
        int b=Sc.nextInt();
        int result=Multiply(n1,n2,b);
        System.out.println("Result = "+result);
    }
    public static int Multiply(int n1,int n2,int b){
        int rev=0;
        int p=1;
        while(n2>0){
                int d2=n2%10;
                n2=n2/10;

                int sprd = getproduct(n1,d2,b);
                rev=add(rev,sprd*10,b);
                p=p*10;
                

        }
        return rev;

    }


    public static int getproduct  (int n1,int d2,int b){
        int rev=0;int c=0;
        int p=1;
        while(n1>0 || c>0){
            int d1=n1%10;
            n1=n1/10;

            int d=d1*d2+c;
            c=d/b;
            d=d%b;

            rev+=d*p;
            p=p*10;
        }
        return rev;
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
