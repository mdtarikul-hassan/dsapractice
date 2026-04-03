public class PeakElementFinder {
    static  int findPeakElement(int[] nums) {
    // ---------------- brute force approach ---------------- O(n)
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     boolean left = (i == 0) || (nums[i] >= nums[i - 1]);
        //     boolean right = (i == n - 1) || (nums[i] >= nums[i + 1]);
        //     if (left && right) return i;
        // }
        // return -1;


    // ----------------------- optimal approach -------------- O(logn)
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] > nums[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 20, 4, 1, 0};
        int index = findPeakElement(nums);
        System.out.println("Peak at index: " + index + " with value: " + nums[index]);
    }
}
