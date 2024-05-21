import java.util.Scanner;

public class Smaller_or_Equal {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=Sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements ");
        int i;
        int c=0;
        for (i = 0; i < n; i++) {
            a[i]=Sc.nextInt();
        }
        System.out.println("Enter Checking Element");
        int b=Sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]<=b)
            {
                c++;
            }
        }
        System.out.println("Elements less than "+b+" are : "+c);
            
        }
    }

