public class MinimuminRotatedSearchArray {
    static int findMin(int[] nums) {
    // ---------------------- brute force approach ----------------- O(n)
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            minVal = Math.min(minVal, nums[i]);
        }
        return minVal;
    }
     public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int result = findMin(nums);
        System.out.println("Minimum element is " + result);
    }
}
