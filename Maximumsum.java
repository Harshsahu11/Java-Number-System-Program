import java.util.Scanner;

public class Maximumsum {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Number of elements in array");
        int n=Sc.nextInt();
        int a[]=new int[n];
        int i,j;
        System.out.println("Enter Number Of Elements in Array");
        for(i=0;i<n;i++)
        {
            a[i]=Sc.nextInt();
        }
        System.out.println("Enter the Number of Elements You want Sum Of");
        int b=Sc.nextInt(); 
        
       int sum1=0;
       int sum2=0;
       for(i=0;i<b;i++)
       {
        sum1+=a[i];
       }
       sum2=sum1;
       int l=n-1;
       for(i=b-1;i>=0;i--)
       {
        sum1=sum1+a[l]-a[i];
        sum2=Math.max(sum1,sum2);
        l--;
       }
       System.out.println(sum2);


    }
    
}
