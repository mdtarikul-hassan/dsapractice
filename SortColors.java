public class SortColors {
    // sort colors as a 0, 1, 2 by bruteforce aproach -> O(n2) 
    public void sortColors(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] >= nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
