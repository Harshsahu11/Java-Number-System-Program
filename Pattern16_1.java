import java.util.*;
public class Pattern16_1 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System .in);
        int n=Sc.nextInt();
        int st=1;
        int sp=2*n-3;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            if(i==n)
            {
                st--;
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            sp-=2;
            st++;
            System.out.println();
        }
    }
}
