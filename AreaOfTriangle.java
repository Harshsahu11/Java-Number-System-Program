import java.util.*;
class AreaOfTriangle
{
    public static void main()
    {
        double base,height,area;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Base");
        base=Sc.nextDouble();
        System.out.println("Enter Height");
        height=Sc.nextDouble();
        area=0.5*base*height;
        System.out.println("Area Of Circle: "+area);
    }
}