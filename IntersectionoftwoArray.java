
import java.util.*;

public class IntersectionoftwoArray {
// ----------------- brute force approach --------------- O(n2)
    static ArrayList<Integer> intersection(int[] a, int[] b){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i< a.length; i++){
            for(int j = 0; j< b.length; j++){
                if(a[i] == b[j]){
                    if(!list.contains(a[i])){
                        list.add(a[i]);
                    }
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};

        ArrayList<Integer> res = intersection(a, b);

        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
