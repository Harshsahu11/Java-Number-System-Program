import java.util.Scanner;

class Student{
    int admino;
    float eng,maths,science;
    String sname;
    float total;
    float ctotal()
    {
        total=eng+maths+science;
        return total;
    }
    void Takedata()
    {
        
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Name");
        sname=Sc.nextLine();
        System.out.println("Enter Admission Number");
        admino=Sc.nextInt();
        System.out.println("Enter Marks of Three Subject");
        eng=Sc.nextFloat();
        maths=Sc.nextFloat();
        science=Sc.nextFloat();
        
        ctotal();

    }
    void showdata()
    {
        System.out.println("Admission number = "+admino);
        System.out.println("Name = "+sname);
        System.out.println("Marks of Maths = "+maths);
        System.out.println("Marks of Science = "+science);
        System.out.println("Marks of Engineering = "+eng);
        System.out.println("Total marks = "+total);
    }
    public static void main(String args[])
    {
        Student ob=new Student();
        ob.Takedata();;
        ob.showdata();
    }
}
