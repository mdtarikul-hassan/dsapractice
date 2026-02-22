import java.util.ArrayList;
import java.util.Collections;

public class UnionoftwoSortedArray {
    static ArrayList<Integer> findUnion(int[] a, int[] b){
    // -------------------- brute force approach ------------- o(n*m)
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (!res.contains(a[i])) {
                res.add(a[i]);
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (!res.contains(b[i])) {
                res.add(b[i]);
            }
        }
        Collections.sort(res);
        return res;
    }
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 2, 4};
        int[] b = {2, 2, 4, 4};
        ArrayList<Integer> newArr = findUnion(a, b);

        for(int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
