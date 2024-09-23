import java.util.Scanner;

public class Pattern15_6 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int sp=n/2;
        int st=1;
        int temp=1;
        for(int i=1;i<=n;i++)
        {

            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            int val=temp;
            for(int k=1;k<=st;k++){
                System.out.print(val+"\t");
                if(k<=st/2){
                    val++;
                }else {
                    val--;
                }
            }
            if(i<=n/2){
                sp--;
                st+=2;
                temp++;
            }
            else{
                sp++;
                st-=2;
                temp--;
            }
            System.out.println();
        }
    }
}
