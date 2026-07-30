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
        // int ans = 0;
        // for(int i = 0; i<nums.length; i++){
        //     ans = ans ^ nums[i];
        // }
        // return ans;
    
    // ------------- optimal by binary search O(logn)    
        if(nums.length == 1){
            return nums[0];
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1] != nums[nums.length-2]){
            return nums[nums.length-1];
        }

        int l=1, r=nums.length-2;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }else if((mid %2 == 0 && nums[mid] == nums[mid-1]) || (mid %2 == 1 && nums[mid] == nums[mid+1])){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println("single element is "+ singleNonDuplicate(arr));
    }
}
