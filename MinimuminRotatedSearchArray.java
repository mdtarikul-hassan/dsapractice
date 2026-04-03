public class MinimuminRotatedSearchArray {
    static int findMin(int[] nums) {
    // ---------------------- brute force approach ----------------- O(n)
        // int minVal = Integer.MAX_VALUE;
        // for (int i = 0; i < nums.length; i++) {
        //     minVal = Math.min(minVal, nums[i]);
        // }
        // return minVal;


    // ----------------- optimal approach ---------------- O(logn)
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
     public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int result = findMin(nums);
        System.out.println("Minimum element is " + result);
    }
}
