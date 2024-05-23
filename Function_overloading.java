import java.util.*;
class Function_overloading
{
    public void Area(float r)
    {
        double area=3.14* r *r;
        System.out.println("Area of Circle = "+area);
    }
    public void Area(int a)
    {
        int area=a*a;
        System.out.println("Area of Square = "+area);
    }
    public void Area(int l,int b)
    {
        int area=l*b;
        System.out.println("Area of Rectangle = "+area);
    }
    public static void main(String[] args) 
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Radius of Circle");
        float R=Sc.nextFloat();
        System.out.println("Enter Side of Square");
        int A=Sc.nextInt();
        System.out.println("Enter length and breadth of Rectangle");
        int L=Sc.nextInt();
        int B=Sc.nextInt();
        Function_overloading ob=new Function_overloading();
        ob.Area(R);
        ob.Area(A);
        ob.Area(L, B);

    }
}