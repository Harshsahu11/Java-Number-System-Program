import java.util.Scanner;

public class Span_of_array {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=Sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Sc.nextInt();
        }
        int min=a[0];
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            else if(a[i]<min){
                min=a[i];
            }
        }
        int d=max-min;
        System.out.println("Span of array : "+d);
    }
}
