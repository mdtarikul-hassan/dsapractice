import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElement {
    // ********************* Find First non repeating element **************

    static int firstNonRepeating(int[] arr){
    // ------------------------ brute force approach ------------ O(n2)
        // int n = arr.length;
        // for(int i = 0; i< n; i++){
        //     int j;
        //     for(j = 0; j< n; j++){
        //         if(i != j && arr[i] == arr[j]){
        //             break;
        //         }
        //     }
        //     if(j == n){
        //         return arr[i];
        //     }
        // }
        // return -1;

    // ------------------- optimal by hashing ---------------- O(n)
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }
        for(int i = 0; i< n; i++){
            if(map.get(arr[i]) == 1){
                return arr[i];
            }
        }
        return -1;
    }

    // ***********************************find all non repeating elements ********************
    
    static void allNonRepeating(int[] arr){
    // ------------------- optimal by hashing ---------------- O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : arr){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.print(entry.getKey() + " ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 9, 4, 9,2, 6, 7, 4 };

        System.out.println(firstNonRepeating(arr));
        allNonRepeating(arr);

    }
}
