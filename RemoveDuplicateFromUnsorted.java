import java.util.ArrayList;

public class RemoveDuplicateFromUnsorted {
    public static ArrayList<Integer> removeDupliacte(int[] nums) {
    // -----------brute force -----------------------
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i = 0; i< nums.length; i++){
            boolean found = false;
            for(int j = 0; j< arrList.size(); j++){
                if(nums[i] == arrList.get(j)){
                    found = true;
                    break;
                }
            }
            if(!found){
                arrList.add(nums[i]);
            }
        }
        
        return arrList;

    // ------------------------ optimal [by hashing] ----------------


    
    }

    public static void main(String[] args){
         int[] arr = {4, 5, 4, 2, 2, 3, 1};

        ArrayList<Integer> result = removeDupliacte(arr);

        System.out.print("Array after removing duplicates: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
