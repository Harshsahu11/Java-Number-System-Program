import java.util.ArrayList;

public class FirstIndex {
    public int FindIndex(ArrayList<Integer> A, int target) {
        int low = 0, high = A.size()-1, mid, ans=-1;
        while(low<=high) {
            mid = (low+high)/2;
            if(A.get(mid)<target) {
                low = mid+1;
            }
            else {
                high = mid-1;
                ans = mid;
            }
        }
        return ans;
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> ar = new ArrayList<>();

        for(int i=1; i<A.size(); i++) {
            A.set(i, Math.max(A.get(i-1), A.get(i)));
        }
        for(int i: B) {
            ar.add(FindIndex(A, i));
        }
        return ar;
    }
}
