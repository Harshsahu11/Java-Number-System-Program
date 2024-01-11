import java.util.*;
class EquilateralTriangle
{
    public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Side of Triangle");
        int a=Sc.nextInt();
        double area=Math.abs((Math.sqrt(3)/4)*a*a);
        System.out.println(area);
    }
}