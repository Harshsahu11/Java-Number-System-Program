import java.util.Scanner;

public class Benjamin_Bulbs {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter number of bulbs");
        int n=Sc.nextInt();
        for(int i=1;i*i<=n;i++) {
            System.out.println(i*i);
        }

    }
}
