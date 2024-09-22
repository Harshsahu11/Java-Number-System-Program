import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int k=1;k<i;k++)
            {
                System.out.print("\t");
            }
            for(int j=n;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
