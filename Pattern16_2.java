import java.util.Scanner;

public class Pattern16_2 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System .in);
        int n=Sc.nextInt();
        int st=1;
        int sp=2*n-3;
        int temp;
        for(int i=1;i<=n;i++)
        {
            temp=1;
            for(int j=1;j<=st;j++){

                System.out.print(temp+"\t");
                temp++;

            }
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            if(i==n)
            {
                temp--;
                st--;
            }
            for(int j=1;j<=st;j++){
                temp--;
                System.out.print(temp+"\t");

            }
            sp-=2;
            st++;
            System.out.println();
        }
    }
}
