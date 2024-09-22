import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int f1 = 0;
        int f2 = 1;
        int temp = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i==1&&j==1) {
                    System.out.print(f1 + "\t");
                }
                else if(i==2&&j==1){
                    System.out.print(f2 + "\t");
                }
                else
                {
                    int f3 = f1 + f2;
                    System.out.print(f3 + "\t");
                    f1 = f2;
                    f2 = f3;
                }
            }
            System.out.println();
        }
    }
}

