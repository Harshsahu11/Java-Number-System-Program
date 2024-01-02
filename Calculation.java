import java.util.*;
class Calculation
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Two Number");
        a=Sc.nextInt();
        b=Sc.nextInt();
        System.out.println("Addition\t: "+(a+b));
        System.out.println("SUbtraction\t: "+(a-b));
        System.out.println("Muntiplication\t: "+(a*b));
        System.out.println("Division\t: "+(a/b));
        System.out.println("Modulus\t\t: "+(a%b));
    }
}