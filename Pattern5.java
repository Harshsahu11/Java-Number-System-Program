import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int sp=n/2;
        int st=1;
        for(int i=1;i<=n;i++){
            //  System.out.println(sp+"  "+st);
            for(int j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=st;k++){
                System.out.print("*");
            }
            if(i<=n/2){
                sp--;
                st+=2;
            }
            else{
                sp++;
                st-=2;
            }
            System.out.println();
        }
    }
}
