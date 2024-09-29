import java.util.*;
public class StackExample
{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(10);
        System.out.println(st+" -> "+st.peek()+"  "+st.size());
        st.push(45);
        System.out.println(st+" -> "+st.peek()+"  "+st.size());
        st.push(87);
        System.out.println(st+" -> "+st.peek()+"  "+st.size());
        st.push(56);
        System.out.println(st+" -> "+st.peek()+"  "+st.size());
        st.push(77);
        System.out.println(st+" -> "+st.peek()+"  "+st.size());
        st.pop();
        System.out.println(st+" -> "+st.peek()+"  "+st.size());
        st.pop();
        System.out.println(st+" -> "+st.peek()+"  "+st.size());
        st.pop();
        System.out.println(st+" -> "+st.peek()+"  "+st.size());


    }
}
