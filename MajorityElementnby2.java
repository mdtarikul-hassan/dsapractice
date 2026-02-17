
public class MajorityElementnby2 {
    public static int Majority(int[] nums) {
    // ----------------- brute force -------------- O(n2)
        // int n = nums.length;
        // for(int i = 0; i< nums.length; i++){
        //     int count = 0;
        //     for (int j = 0; j < nums.length; j++) {
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }if(count > (n/2)){
        //             return nums[i];
        //         }
        //     }
        // }
        // return -1;
        
    // -------------------- better by Hashmap --------------- O(n)
        // int n = nums.length;
        // int major = -1;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i< n; i++){
        //     // if(map.containsKey(nums[i])){
        //     //     map.put(nums[i], map.get(nums[i]) + 1);
        //     // }else{
        //     //     map.put(nums[i], 1);
        //     // }
        //     map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        // }

        // // Set<Integer> keySet = map.keySet();
        // // for(Integer key : keySet){
        // //     if(map.get(key) > n/2){
        // //         major = key;
        // //     }
        // // }
        // for(Integer key : map.keySet()){
        //     if(map.get(key) > n/2){
        //         major = key;
        //     }
        // }
        // return major;
    
    // -------------- better or optimal by array ------------
        int n = nums.length;
        int i = 0;
        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] == nums[i]){
                count++;
            }if(count > (n/2)){
                return nums[j];
            }
            i++;
        }
        
        return -1;
    }
        
    public static void main(String[] args){
        int[] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        int ans = Majority(arr);
        
        System.out.println("The majority element is: " + ans);

    }
}
