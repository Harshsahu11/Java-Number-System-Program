import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int st = (n / 2)+1;
        int sp = 1;
        for (int i = 1; i <= n; i++) {
            // System.out.println(st+"  "+sp+" "+st);
            for (int j = 1; j <= st; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= sp; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*");
            }
            if (i <= n / 2) {
                st--;
                sp += 2;
            } else {
                st++;
                sp -= 2;
            }
            System.out.println();
        }
    }
}
