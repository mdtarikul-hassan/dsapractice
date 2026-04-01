import java.util.Arrays;
import java.util.List;

public class FirstAndLastOccurrence {
    static int solve(int n, int key, List<Integer> v) {
    // ----------------------- brute force approach (Last ocurrence) -------------- O(logn)
        int res = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (v.get(i) == key) {
                res = i;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 7;
        int key = 13;
        List<Integer> v = Arrays.asList(3, 4, 13, 13, 13, 20, 40);
        int ans = solve(n, key, v);
        System.out.println(ans);
    }
}
