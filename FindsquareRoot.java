public class FindsquareRoot {
    static int floorSqrt(int n) {
    // ---------------- brute force approach ------------ O(n)
        // int ans = 0;
        // for (int i = 1; i <= n; i++) {
        //     if ((long)(i) * i <= n) {
        //         ans = i;
        //     } else {
        //         break;
        //     }
        // }
        // return ans;


    // ------------------ optimal approach -------------- O(logn)
        if (n < 2) return n;
        int left = 1, right = n / 2, ans = 0;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid <= n) {
                ans = (int) mid;
                left = (int) mid + 1;
            } else {
                right = (int) mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 27;
        System.out.println(floorSqrt(n));
    }
}
