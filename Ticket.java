import java.util.Scanner;

public class Ticket {
    int Flight;
    String Destination;
    float Distance;
    float fuel;
    float CALFUEL()
    {
        if(Distance<=1000)
        {
            fuel=500;
        }
        else if(Distance<=2000)
        {
            fuel=1100;
        }
        else
        {
            fuel=2200;
        }
        return fuel;
    }
    void FEEDINFO()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Destination");
        Destination=Sc.nextLine();
        System.out.println("Enter Flight Number");
        Flight=Sc.nextInt();
        System.out.println("Enter Distance");
        Distance=Sc.nextFloat();
        CALFUEL();
    }
    void SHOWINFO()
    {
        System.out.println("Flight Number :"+Flight);
        System.out.println("Destination :"+Destination);
        System.out.println("Distance :"+Distance);
        System.out.println("Fuel: "+fuel);
    }
    public static void main(String[] args) {
        Ticket ob=new Ticket();
        ob.FEEDINFO();
        ob.SHOWINFO();
    }
}
