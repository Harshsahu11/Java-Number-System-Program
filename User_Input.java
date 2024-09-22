import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Integer Number");
        int Inte=Sc.nextInt();
        System.out.println("Integer = "+Inte);
        System.out.println("Enter Floating Number");
        float num=Sc.nextFloat();
        System.out.println("Floating number = "+num);
        System.out.println("Enter String");
        Sc.next();
        String S=Sc.nextLine();
        System.out.println(S);
        System.out.println("Enter Double");
        double n=Sc.nextDouble();
        System.out.println(n);

    }
}
