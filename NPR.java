import java.util.Scanner;

public class NPR {
    public static int fact(int x){
        int rv=1;
        for(int i=1;i<=x;i++){
            rv=rv*i;
        }
        return rv;
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter value of N and R");
        int n=Sc.nextInt();
        int r=Sc.nextInt();
        int npr=fact(n)/fact(n-r);
        System.out.println(n +" p "+r+" = "+npr);

    }
}
