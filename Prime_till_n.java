import java.util.Scanner;

public class Prime_till_n {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter till where You need to Print Prime Number");
        int n=Sc.nextInt();
        int temp=0;
        int arr[]=new int[n];
        for(int i=2;i<=n;i++)
        {
            int c=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    c++;
                    break;
                }
            }
            if(c==0)
            {
                arr[temp]=i;
                temp++;
            }
        }
        for(int i=0;i<temp;i++)
            System.out.print(arr[i]+" ");
    }
}
