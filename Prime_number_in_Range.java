import java.util.Scanner;

public class Prime_number_in_Range {
        public static void main(String[] args) {
            Scanner Sc=new Scanner(System.in);
            System.out.println("Enter Lower Limit");
            int low=Sc.nextInt();
            System.out.println("Enter Higher Limit");
            int high=Sc.nextInt();
            for(int i=low;i<=high;i++)
            {
                int c=0;
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                    {
                        c++;
                        break;
                    }
                }
                if(c==0)
                {
                    System.out.print(i+" ");
                }
            }

        }


}
