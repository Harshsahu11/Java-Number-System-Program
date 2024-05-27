import java.util.Scanner;

public class Hayback_Needle {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Hayback String");
        String S=Sc.nextLine();
        System.out.println("Enter String you want to search");
        String F=Sc.nextLine();
        int l=F.length();
        int len=S.length();
        int t=0;
        int pos=-1;
        for(int i=0;i<len-l+1;i++)
        {
            String P=S.substring(i,(i+l));
            if(P.equalsIgnoreCase(F))
            {
                t++;
                pos=i;
                break;
            }
        }
        if (t==1) {
            System.out.println(pos);
            
        }
        else{
            System.out.println(pos);
        }

    }
}
