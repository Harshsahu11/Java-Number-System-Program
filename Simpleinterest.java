import java.util.*;
public class Simpleinterest {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Principle Amount");
        int Principle=Sc.nextInt();
        System.out.println("Enter Rate");
        float rate=Sc.nextFloat();
        System.out.println("Enter Time");
        int Time=Sc.nextInt();
        double Simpleintrest=Principle+((Principle*rate*Time)/100);
        System.out.println("Simple Intrest : "+Simpleintrest);
    }
    
}
