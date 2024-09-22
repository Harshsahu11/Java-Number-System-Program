import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int temp=1;
        for(int i=1;i<=n;i++){
            int num=temp;
            while(num!=0){
                int d=num%10;
                System.out.print(d+"\t");
                num=num/10;
            }
            temp=temp*11;
            System.out.println();
        }
    }
}
