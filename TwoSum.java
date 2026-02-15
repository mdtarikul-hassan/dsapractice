import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
    // ---------------------------- brute force ------------------------
        // for(int i = 0; i<nums.length; i++){
        //     for(int j=i+1; j< nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return null;

    // ------------------------ optimal [by using hashing] -------------------- O(n)
        // it's complete after hashing
         HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
        
    }
    public static void main(String[] args){
        int[] arr = {1,6,2,10,3};
        int target = 7;
        int[] newArr = new int[2];
        newArr = twoSum(arr,target);
        System.out.print("New array is : [");
        for(int i = 0; i< newArr.length; i++){
            System.out.print(i + " ");
        }
        System.out.println("]");

    }
}