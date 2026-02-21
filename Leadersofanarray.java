import java.util.*;

public class Leadersofanarray {
    static List<Integer> leader(int[] arr){
    // -------------- brute force -------------  O(n2)
        // List<Integer> ans = new ArrayList<>();
        // for(int i = 0; i< arr.length; i++){
        //     boolean leader  =true;
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[j] >= arr[i]){
        //             leader = false;
        //             break;
        //         }
        //     }
        //     if(leader){
        //        ans.add(arr[i]); 
        //     }
        // }
        // return ans;
    
    // ----------------- optimal -------------------- O(n)
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(arr.length == 0){
            return ans;
        }
        int max = arr[arr.length -1];
        ans.add(arr[arr.length -1]);
        for(int i = arr.length -2; i> 0; i--){
            if(arr[i] > max){
                max = arr[i];
                ans.add(arr[i]);
            }
        }

        Collections.reverse(ans);

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 1, 2};
        
        List<Integer> ans =  leader(nums);

        System.out.print("Leaders in the array are: ");
        for (int leader : ans) {
            System.out.print(leader + " ");
        }
        System.out.println();
    }
}
