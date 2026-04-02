public class FindsquareRoot {
    static int floorSqrt(int n) {
    // ---------------- brute force approach ------------ O(n)
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if ((long)(i) * i <= n) {
                ans = i;
            } else {
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 27;
        System.out.println(floorSqrt(n));
    }
}
