import java.util.*;
public class Duplicate_Bracket {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        String S=Sc.nextLine();
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(ch==')'){
                if(st.peek()=='('){
                    System.out.println(true);
                    return;
                }
                else{
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }

            }
            else{
                st.push(ch);
            }
        }
        System.out.println(false);
    }
}
