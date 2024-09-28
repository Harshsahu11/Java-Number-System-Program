import java.util.Scanner;

public class Sum_of_two_array {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n1 = Sc.nextInt();
        int a1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = Sc.nextInt();
        }
        int n2 = Sc.nextInt();
        int a2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = Sc.nextInt();
        }
        int max=Math.max(n1,n2);
        int sum[]=new int[max];
        int c=0;
        int i= a1.length-1;
        int j= a2.length-1;
        int k=sum.length-1;
        while(k>=0){
            int d=c;
            if(i>=0){
                d+=a1[i];
            }
            if(j>=0){
                d+=a2[j];
            }
            c=d/10;
            d=d%10;

            sum[k]=d;

            i--;
            j--;
            k--;
        }
        if(c!=0){
            System.out.print(c);
        }
        for(int val:sum)
        {
            System.out.println(val);
        }

    }
}