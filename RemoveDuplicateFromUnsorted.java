import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateFromUnsorted {
    public static ArrayList<Integer> removeDupliacte(int[] nums) {
    // -----------brute force ----------------------- O(n2)
        // ArrayList<Integer> arrList = new ArrayList<>();
        // for(int i = 0; i< nums.length; i++){
        //     boolean found = false;
        //     for(int j = 0; j< arrList.size(); j++){
        //         if(nums[i] == arrList.get(j)){
        //             found = true;
        //             break;
        //         }
        //     }
        //     if(!found){
        //         arrList.add(nums[i]);
        //     }
        // }
        // return arrList;

    // less code -> O(n)
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        return list;

    // ------------------------ optimal [by hashing] ---------------- O(n)
        // HashMap<Integer, Boolean> seen = new HashMap<>();
        // ArrayList<Integer> result = new ArrayList<>();

        // for (int val : nums) {
        //     if (!seen.containsKey(val)) {
        //         result.add(val);
        //         seen.put(val, true);
        //     }
        // }
        // return result;
    }

    public static HashSet<Integer> removeDupliacteFromUnsorted(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        return set;
    
    }

    public static void main(String[] args){
        int[] arr = {4, 5, 4, 2, 2, 3, 1};

        ArrayList<Integer> result = removeDupliacte(arr);

        System.out.print("Array after removing duplicates: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    
        HashSet<Integer> resultnew = removeDupliacteFromUnsorted(arr);

        System.out.print("Array after removing duplicates by set: ");
        for (int num : resultnew) {
            System.out.print(num + " ");
        }
    }
}
