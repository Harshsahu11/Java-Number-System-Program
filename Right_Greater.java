import java.util.Scanner;
import java.util.Stack;

public class Right_Greater {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int arr[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        int nge[] = new int[arr.length];
        st.push(0);
        for(int i=1;i<arr.length;i++){
            while((st.size() > 0) && arr[i]> arr[st.peek()]){
                int pos=st.peek();
                nge[pos]=arr[i];
                st.pop();
            }
            st.push(i);

        }
        while(st.size()>0){
            int pos=st.peek();
            arr[pos]=-1;
            st.pop();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(nge[i]);
        }
    }
}
