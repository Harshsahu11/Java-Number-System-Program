import java.util.Scanner;

public class Pythagorean_Triplets {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter three Numbers");
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        int c=Sc.nextInt();
        int tell=0;
        if(a>b&&a>c)
        {
            if((a*a)==((b*b)+(c*c)))
            {
                tell=1;
            }
        }
        else if(b>a&&b>c)
        {
            if((b*b)==((a*a)+(c*c)))
            {
                tell=1;
            }
        }
        else{
            if((c*c)==((a*a)+(b*b)))
            {
                tell=1;
            }
        }
        if(tell==1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
