import java.util.*;
public class Test {
    int TestCode;
    String Description;
    int NoCandidate;
    int CenterReqd;
    int CALCNTR()
    {
        CenterReqd=(NoCandidate/100+1);
        return CenterReqd;
    }
    void SCHEDULE()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Description");
        Description=Sc.nextLine();
        System.out.println("Enter Testcode");
        TestCode=Sc.nextInt();
        System.out.println("Enter No of Candidates");
        NoCandidate=Sc.nextInt();
        CALCNTR();

    }
    void DISPTEST()
    {
        System.out.println("Test Code : "+TestCode);
        System.out.println("Description : "+Description);
        System.out.println("No of Candidates : "+NoCandidate);
        System.out.println("Centres Required : "+CenterReqd);
    }
    public static void main(String[] args) {
        Test ob=new Test();
        ob.SCHEDULE();
        ob.DISPTEST();
    }
}
