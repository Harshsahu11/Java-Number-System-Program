import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Terms");
        int n = Sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int floor=max;floor >=1;floor--)
        {
            for (int i=0;i<n;i++){
                if(a[i]>=floor){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
