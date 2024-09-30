import java.util.Scanner;
import java.util.Stack;


public class stock_span {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int arr[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        int span[] = new int[arr.length];
        st.push(0);
        span[0]=1;
        for(int i=1;i<arr.length;i++)
        {
            while(st.size()>0&&arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                span[i]=i+1;
            }else{
                span[i]=i-st.peek();
            }
            st.push(i);
        }
        for(int val:span){
            System.out.println(val);
        }
    }
}
