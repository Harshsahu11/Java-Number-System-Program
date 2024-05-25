import java.util.Scanner;

public class Last_digit_Count {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter starting Index ");
        int A=Sc.nextInt();
        System.out.println("Enter Ending Index");
        int B=Sc.nextInt();
        System.out.println("Enter The dist digit You Want");
        int C=Sc.nextInt();
        int Count=0;
        for(int i=A;i<=B;i++)
        {
            if(i%10==C)
            {
                Count++;
            }
        } 
        System.out.println("Total Number Present : "+Count);
    }
}
