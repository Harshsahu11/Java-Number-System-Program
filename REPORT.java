import java.util.Scanner;

public class REPORT {
    int admno;
    String name;
    float marks[];
    float average;
    float GETAVG()
    {
        int i;
        float s=0;
        for(i=0;i<5;i++)
        {
            s=s+marks[i];
        }
        average=s/5;
        return average;

    }
    void READINFO()
    {
        Scanner Sc=new Scanner(System.in);
        marks=new float[5];
        System.out.println("Enter Name");
        name=Sc.nextLine();
        System.out.println("Enter Admno");
        admno=Sc.nextInt();
        System.out.println("Enter Marks of 5 Subjects");
        for(int i=0;i<5;i++)
        {
            marks[i]=Sc.nextFloat();
        }
        GETAVG();

    }
    void DISPLAYINFO()
    {
        System.out.println("Name : "+name);
        System.out.println("Admno : "+admno);
        System.out.print("Marks : ");
        for(int i=0;i<5;i++)
        {
            System.out.print(marks[i]+",");
        }
        System.out.println("");
        System.out.println("Average : "+average);
    }
    public static void main(String[] args) {
        REPORT ob=new REPORT();
        ob.READINFO();
        ob.DISPLAYINFO();
    }

}
