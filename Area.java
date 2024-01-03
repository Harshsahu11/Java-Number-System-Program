import java.util.*;
class Area
{
    public static void main()
    {
        double r,area,pi=3.14;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Radius");
        r=Sc.nextDouble();
        area=pi*(r*r);
        System.out.println("Area Of Circle: "+area);
    }
}