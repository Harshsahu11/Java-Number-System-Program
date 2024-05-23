import java.util.Scanner;

public class Batsman {
    int bcode;
    String bname;
    int innings,notout;
    float runss;
    float batavg;
    float calavg()
    {
        batavg =runss/(innings-notout);
        return batavg;
    }
    void readdata()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Bname");
        bname=Sc.nextLine();
        System.out.println("Enter Bcode");
        bcode=Sc.nextInt();
        System.out.println("Enter Innnings");
        innings=Sc.nextInt();
        System.out.println("Enter Notout");
        notout=Sc.nextInt();
        System.out.println("Enter Runs");
        runss=Sc.nextFloat();
        calavg();
    }
    void displaydata()
    {
        System.out.println("Bcode = "+bcode);
        System.out.println("BName = "+bname);
        System.out.println("Innings = "+innings);
        System.out.println("Notout = "+notout);
        System.out.println("Runs = "+runss);
        System.out.println("Bat Average = "+batavg);
    }
    public static void main(String args[])
    {
        Batsman ob = new Batsman();
        ob.readdata();

        ob.displaydata();
    }
}
