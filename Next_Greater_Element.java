import java.util.*;
public class Next_Greater_Element {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int arr[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++) {
            arr[i] = Sc.nextInt();
        }
        int nge[]=new int[arr.length];
        st.push(arr[arr.length-1]);
        nge[arr.length-1]=-1;
        for(int i= arr.length-2;i>=0;i--){
            while(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                nge[i]=-1;
            }
            else{
                nge[i]=st.peek();
            }
            st.push(arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(nge[i]);
        }
    }
}
