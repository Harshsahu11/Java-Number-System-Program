import java.util.Scanner;

public class Functions {
    
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter value of N and R");
        int n=Sc.nextInt();
        int r=Sc.nextInt();
        int nfact=1;
        for(int i=1;i<=n;i++){
            nfact*=i;
        }
        int rfact=1;
        for(int i=1;i<=n-r;i++){
            rfact *=i;
        }
        int npr=nfact/rfact;
        System.out.println(n +" p "+r+" = "+npr);

    }
}
