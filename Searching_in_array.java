import java.util.Scanner;

public class Searching_in_array {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Terms");
        int n=Sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Sc.nextInt();
        }
        System.out.println("Enter the Element to search");
        int search=Sc.nextInt();int pos=-1;
        for(int i=0;i<n;i++){
            if(a[i]==search){
                pos=i;
            }
        }
        System.out.println(pos);
    }
}
