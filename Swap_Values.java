import java.util.*;
public class Swap_Values {
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter 2 Numbers");
        int n1=Sc.nextInt();
        int n2=Sc.nextInt();
        int t;
        System.out.println("Values Before swapping are : "+n1+" ,"+n2);
        t=n1;
        n1=n2;
        n2=t;
        System.out.println("Values After swapping are : "+n1+" ,"+n2);

    }
}
