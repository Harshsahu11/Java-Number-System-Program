import java.sql.SQLOutput;
import java.util.*;
public class Balanced_Bracket {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        String S=Sc.nextLine();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else if(ch==')'){
                boolean val=handleclosing(st,'(');
                if(val==false){
                    System.out.println(val);
                    return;
                }

            }

            else if (ch == '}') {
                boolean val=handleclosing(st,'{');
                if(val==false) {
                    System.out.println(val);
                    return;
                }

            }

            else if(ch==']'){
                boolean val=handleclosing(st,'[');
                    if(val==false) {
                        System.out.println(val);
                        return;
                    }
            }
        }
        if(st.size()==0){
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
    public static boolean handleclosing(Stack<Character> st,char carr){
        if(st.size()==0){

            return false;
        }
        else if(st.peek()!=carr){

            return false;
        }
        else
        {
            st.pop();
            return true;
        }
    }
}
