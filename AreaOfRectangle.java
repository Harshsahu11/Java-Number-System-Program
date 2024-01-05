import java.util.*;
class AreaOfRectangle
{
    public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter 2 Sides Of Rectangle");
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        int area=a*b;
        System.out.println("Area of Triangle "+area);
    }
}