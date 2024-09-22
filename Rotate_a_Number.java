import java.util.Scanner;

public class Rotate_a_Number {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=Sc.nextInt();
        System.out.println("Enter the Value how much you want to rotate");
        int k=Sc.nextInt();
        int nod=0;
        int temp=n;
        while(temp>0)
        {
            temp=temp/10;
            nod++;
        }
        k=k%nod;
        if(k<0){
            k=k+nod;
        }
        int div=1;
        int mul=1;
        for(int i=1;i<=nod;i++){
            if(i<=k){
                div=div*10;
            }
            else{
                mul=mul*10;
            }
        }
        int q=n/div;
        int rem=n%div;
         rem=rem*mul+q;
        System.out.println(rem);
    }
}
