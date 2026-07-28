import java.util.Arrays;
import java.util.List;

public class FirstAndLastOccurrence {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findFirst(nums, target), findLast(nums, target)};
    }
    private int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
    private int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
    static int solve(int n, int key, List<Integer> v) {
    // ----------------------- brute force approach (Last ocurrence) -------------- O(logn)
        // int res = -1;
        // for (int i = n - 1; i >= 0; i--) {
        //     if (v.get(i) == key) {
        //         res = i;
        //         break;
        //     }
        // }
        // return res;


    // -------------------- optimal (Last Occurrence) ---------------- O(logn)
        int start = 0;
        int end = n - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (v.get(mid) == key) {
                res = mid;
                start = mid + 1;
            }
            else if (key < v.get(mid)) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
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

        int[] arr = {5,7,7,8,8,10};
        FirstAndLastOccurrence obj = new FirstAndLastOccurrence();
        int[] res =obj.searchRange(arr, 8);
        System.out.println("first : "+ res[0]+" and last : "+res[1]);
    }
}
