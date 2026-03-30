import java.util.ArrayList;
import java.util.List;

public class GenerateSubstring {
// ------------------------------ by recursion ------------------------- O(n*2n)
    // static void subsetRecur(int i, int[] arr,
    //                         ArrayList<ArrayList<Integer>> res,
    //                         ArrayList<Integer> subset) {
    //     if (i == arr.length) {
    //         res.add(new ArrayList<>(subset));
    //         return;
    //     }

    //     subset.add(arr[i]);
    //     subsetRecur(i + 1, arr, res, subset);

    //     subset.remove(subset.size() - 1);
    //     subsetRecur(i + 1, arr, res, subset);
    // }

    // static ArrayList<ArrayList<Integer>> subsets(int[] arr) {

    //     ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    //     ArrayList<Integer> subset = new ArrayList<>();
        
    //     subsetRecur(0, arr, res, subset);

    //     return res;
    // }
    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 3};
    //     ArrayList<ArrayList<Integer>> res = subsets(arr);

    //    for (ArrayList<Integer> subset : res) {
    //         System.out.print("[");
    //         for (int i = 0; i < subset.size(); i++) {
    //             System.out.print(subset.get(i));
    //             if (i != subset.size() - 1) System.out.print(", ");
    //         }
    //         System.out.println("]");
    //     }
    // }


// --------------------------- by bit manipulation ---------------------- O(n*2n)

    public static List<List<Integer>> subsets(int[] arr) {
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < (1 << n); i++) {
            List<Integer> subset = new ArrayList<>();

            for (int j = 0; j < n; j++) {
               
                if ((i & (1 << j)) != 0) {
                    subset.add(arr[j]);
                }
            }

            res.add(subset);
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> res = subsets(arr);

        for (int i = 0; i < res.size(); i++) {      
            List<Integer> subset = res.get(i);     
            System.out.print("[");                  
            for (int j = 0; j < subset.size(); j++) { 
                System.out.print(subset.get(j));  
                if (j != subset.size() - 1) 
                    System.out.print(", ");      
            }
            System.out.println("]");              
        }
    }
 
}
