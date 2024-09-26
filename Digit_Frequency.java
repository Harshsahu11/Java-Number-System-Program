import java.util.Scanner;

public class Digit_Frequency {
    public static int frequency(long num,int d){
        int count=0;
        while(num>0){
            int dig= (int) (num%10);
            if(dig==d){
                count++;
            }
            num=num/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        long n=Sc.nextInt();
        System.out.println("Enter the digit whose Frequency is needed");
        int digit=Sc.nextInt();
        int Frequency=frequency(n,digit);
        System.out.println("Frequency = "+Frequency);
    }
}
