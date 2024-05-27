import java.util.Scanner;

public class Round_Table
{
    
        public static void main(String[] args) {
            Scanner Sc=new Scanner(System.in);
            System.out.println("Enter Number");
            int n=Sc.nextInt();
            long ans = 2;
            for(int i = 2; i <= n; ++i)
            {
                ans *= i;
            }
            System.out.println(ans);


        }
}
