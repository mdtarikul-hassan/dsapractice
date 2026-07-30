public class SingleElementInSortedArray {
    static int singleNonDuplicate(int[] nums) {
    // -------------------- brute force  -------------- O(n)
        // if(nums[0] != nums[1]){
        //     return nums[0];
        // }
        // if(nums[nums.length-1] != nums[nums.length-2]){
        //     return nums[nums.length-1];
        // }

        // for(int i = 1; i<nums.length-1; i++){
        //     if(nums[i] != nums[i-1] && nums[i] != nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return -1;


    // ----------------- better approach by XOR -----------------
        int ans = 0;
        for(int i = 0; i<nums.length; i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println("single element is "+ singleNonDuplicate(arr));
    }
}
