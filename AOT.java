import java.util.*;
class AOT

{
    public static void main()
    {
        int a,b,c;double area,s;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter 3 sides");
        a=Sc.nextInt();
        b=Sc.nextInt();
        c=Sc.nextInt();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s*b)*(s-c));
        System.out.println("Area Of Circle: "+area);
    }
}