import java.util.Scanner;

public class Difference_of_array {
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
        int diff[]=new int[n2];
        int i=a1.length-1;
        int j=a2.length-1;
        int k=diff.length-1;
        int c=0;
        while(k>=0){
            int d=0;
            int temp=(i>=0)?a1[i]:0;
            if(a2[j]+c >=temp){
                d=a2[j]-temp;
                c=0;
            }
            else{
                d=a2[j]+c+10*temp;
                c=-1;
            }
            diff[k]=d;
            i--;
            j--;
            k--;

        }
        int idx=0;
        while(idx<diff.length){
            if(diff[idx]==0){
                idx++;
            }
            else{
                break;
            }
        }
        while(idx<diff.length){
            System.out.println(diff[idx]);
            idx++;
        }

    }
}