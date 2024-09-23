import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int X=Sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(X+"\t*\t"+i+"\t=\t"+(X*i));
        }
    }
}
