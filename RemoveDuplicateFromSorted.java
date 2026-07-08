import java.util.HashMap;

public class RemoveDuplicateFromSorted {
    // public static int removeDuplicates(int[] nums) {
    //     if (nums.length == 0) return 0;

    //     int i = 0;

    //     for (int j = 1; j < nums.length; j++) {
    //         if (nums[j] != nums[i]) {
    //             i++;
    //             nums[i] = nums[j];
    //         }
    //     }
    //     return i + 1;
    // }

// remove duplicate and present atmost 2 of every duplicate    -> O(n)
    public static int removeDuplicates(int[] nums) {
        if(nums.length <= 2){
            return nums.length;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int i=0;
        for(int j =0; j< nums.length; j++){
            int count = map.getOrDefault(nums[j], 0);
            if(count < 2){
                nums[i] = nums[j];
                map.put(nums[i], count+1);
                i++;
            }
        }

        return i;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int k = removeDuplicates(nums);

        System.out.println("Unique count = " + k);
        System.out.print("Array after removing duplicates: ");
        for (int x = 0; x < k; x++) {
            System.out.print(nums[x] + " ");
        }
    }
}
