import java.util.*;

public class UnionoftwoSortedArray {
    // -------------------- brute force approach ------------- o(n*m)

    // static ArrayList<Integer> findUnion(int[] a, int[] b){
        // ArrayList<Integer> res = new ArrayList<>();
        // for (int i = 0; i < a.length; i++) {
        //     if (!res.contains(a[i])) {
        //         res.add(a[i]);
        //     }
        // }
        // for (int i = 0; i < b.length; i++) {
        //     if (!res.contains(b[i])) {
        //         res.add(b[i]);
        //     }
        // }
        // Collections.sort(res);
        // return res;
    // }

    // ---------------------- better by using set ----------------- O((n + m) * (log (n + m)))
    static Set<Integer> findUnion(int[] a, int[] b){
        Set<Integer> res = new TreeSet<>();
        for (int num : a) {
            res.add(num);
        }
        for (int num : b) {
            res.add(num);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 2, 4};
        int[] b = {2, 2, 4, 4};

        // ArrayList<Integer> newArr = findUnion(a, b);
        Set<Integer> newArr = findUnion(a, b);

        for(int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
