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
    // static Set<Integer> findUnion(int[] a, int[] b){
    //     Set<Integer> res = new TreeSet<>();
    //     for (int num : a) {
    //         res.add(num);
    //     }
    //     for (int num : b) {
    //         res.add(num);
    //     }
    //     return res;
    // }

// ---------------------- optimal approach ------------ O(n+m)
    // static ArrayList<Integer> findUnion(int[] a, int[] b){
    //     ArrayList<Integer> union = new ArrayList<>();
    //     int n = a.length, m = b.length;
    //     int i = 0, j = 0;
    //     while(i < n && j < m){
    //         if(a[i] < b[j]){
    //             if(union.isEmpty() || union.get(union.size() -1) != a[i]){
    //                 union.add(a[i]); 
    //             }
    //             i++;
    //         }else if(a[i] > b[j]){
    //             if(union.isEmpty() || union.get(union.size() -1) != b[j]){
    //                 union.add(b[j]); 
    //             }
    //             j++;
    //         }else{
    //             if(union.isEmpty() || union.get(union.size() -1) != a[i]){
    //                 union.add(a[i]);
    //             }
    //             i++;
    //             j++;
    //         }
    //     }
    //     while(i < n){
    //         if(union.isEmpty() || union.get(union.size() -1) != a[i]){
    //             union.add(a[i]);
    //         }
    //         i++;
    //     }
    //     while(j < m){
    //         if(union.isEmpty() || union.get(union.size() -1) != b[j]){
    //             union.add(b[j]);
    //         }
    //         j++;
    //     }
    //     return union;
    // }

// -------------- this is same as previous one ---[ Using Merge Step of Merge Sort ] --------- O(n+m)
    static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = a.length;
        int m = b.length;

        int i = 0, j = 0;
        while(i < n && j < m) {
            if(i > 0 && a[i - 1] == a[i]) {
                i++;
                continue;
            }
            if(j > 0 && b[j - 1] == b[j]) {
                j++;
                continue;
            }

            if(a[i] < b[j]) {
                res.add(a[i]);
                i++;
            }else if(a[i] > b[j]) {
                res.add(b[j]);
                j++;
            }else {
                res.add(a[i]);
                i++;
                j++;
            }
        }
        
        while (i < n) {
            if(i > 0 && a[i - 1] == a[i]) {
                i++;
                continue;
            }
            res.add(a[i]);
            i++;
        }
        while (j < m) {
            if(j > 0 && b[j - 1] == b[j]) {
                j++;
                continue;
            }
            res.add(b[j]);
            j++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 2, 4};
        int[] b = {2, 2, 4, 4};

        ArrayList<Integer> newArr = findUnion(a, b);
        // Set<Integer> newArr = findUnion(a, b);

        for(int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
