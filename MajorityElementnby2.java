
public class MajorityElementnby2 {
    public static int Majority(int[] nums) {
    // ----------------- brute force -------------- O(n2)
        int n = nums.length;
        for(int i = 0; i< nums.length; i++){
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }if(count > (n/2)){
                    return nums[i];
                }
            }
        }
        return -1;
        

    }
        
    public static void main(String[] args){
        int[] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        int ans = Majority(arr);
        
        System.out.println("The majority element is: " + ans);

    }
}
