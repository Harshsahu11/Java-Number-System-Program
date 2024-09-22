import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int p=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(p+"\t");
                p++;
            }
            System.out.println();
        }
    }
}
