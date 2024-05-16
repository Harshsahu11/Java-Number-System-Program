import java.util.*;
public class Reverse_String
{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String S=Sc.nextLine();
        int i,j;
        S=" "+S;
        String NewStr="";
        int l=S.length();
        String s="";

        for(i=l-1;i>=0;i--)
        {
           if(S.charAt(i)==' ')
           {
                for(j=s.length()-1;j>=0;j--)
                {
                    NewStr+=s.charAt(j);
                }
                NewStr=NewStr+" ";
                s="";
           }
           else
           {
                s+=S.charAt(i);
           }
        }
        System.out.println(NewStr);
    
    }
}