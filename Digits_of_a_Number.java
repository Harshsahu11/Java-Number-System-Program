import java.util.Scanner;

public class Digits_of_a_Number {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=Sc.nextInt();
        int temp=num;
        int mod=0;
        while(temp>0)
        {
            temp=temp/10;
            mod++;
        }

int div=(int)(Math.pow(10,mod-1));
        while(num>0)
        {
            int d=num/div;
            System.out.println(d);
            num=num%div;
            div=div/10;
        }


    }
}
