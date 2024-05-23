import java.util.Scanner;

public class arraysol {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=Sc.nextInt();
        int a[]=new int[n];
        int i;
        System.out.println("Enter Elements of array");
        for(i=0;i<n;i++){
            a[i]=Sc.nextInt();
        }
        int req=1;
        for(i=0;i<n;i++){
            req=req*2;
            req%=1000000007;
        }
        req=req-1;
        System.out.println("Total number of Operations : "+req);

    }
}
