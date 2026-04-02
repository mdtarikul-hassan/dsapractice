public class SearchinRotatedSortedArray {
    static int search(int[] nums, int target) {
    // ----------------- brute force by linear search approach ---------------- O(n)
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == target) {
        //         return i;
        //     }
        // }
        // return -1;


    // ------------ optimal by binary search approach ---------------- O(logn)
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                }else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }


    // ------------ brute force key is present on not -------------- O(n)
    static boolean searchInARotatedSortedArrayII(int[] arr, int k) {
        for (int num : arr) {
            if (num == k) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // int[] nums = {4, 5, 6, 7, 0, 1, 2};
        // int target = 0;
        // int index = search(nums, target);
        // System.out.println(index);


    // q) key is present or not
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int k = 3;
        boolean ans = searchInARotatedSortedArrayII(arr, k);
        if (!ans)
            System.out.println("Target is not present.");
        else
            System.out.println("Target is present in the array.");
    }
}
