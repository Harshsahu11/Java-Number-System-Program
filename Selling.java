import java.util.Scanner;

public class Selling {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Number of Items Daily");
        int a=Sc.nextInt();
        System.out.println("Enter Total number of Items");
        int b=Sc.nextInt();
        int weeks=1;
        if((b%a)!=0)
        {
            int days=b/a;
            days=days+1;
            int t=days/5;
            weeks=weeks+t;
        }
        else{
        
            int days=b/a;
            int t=days/5;
            if(days%5==0)
            {
                weeks=0;
                weeks=weeks+t;
            }
            else{
                weeks=weeks+t;
            }
        }
        System.out.println("Weeks : "+weeks);
        
    }
}
