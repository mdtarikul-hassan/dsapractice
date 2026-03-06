
import java.util.Arrays;

public class LongestConsecutiveSequence {
// ------------------- brute force approach ----------- O(n2)
    // static boolean linearSearch1(int[] arr, int x){
    //     for(int i = 0; i< arr.length; i++){
    //         if(arr[i] == x){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    // static int longestSequence(int[] arr){
    //     int n = arr.length;
    //     if(n == 0){
    //         return 0;
    //     }
    //     int longest = 1;
    //     for(int i = 0; i< n; i++){
    //         int count = 1;
    //         int x = arr[i];
    //         while (linearSearch1(arr, x+1) == true) { 
    //             x++;
    //             count++;
    //         }
    //         longest = Math.max(longest, count);
    //     }
    //     return longest;
    // }


// ------------------- better approach by array.sort ----------- O(nlogn)
    static int longestSequencebetter(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int lastSmaller = Integer.MIN_VALUE;
        int longest = 1;
        int count = 0;
        for(int i = 0; i< n; i++){
            if(arr[i]-1 == lastSmaller){
                count++;
                lastSmaller = arr[i];
            }else if(arr[i] != lastSmaller){
                count = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] a = {100, 4, 200, 1, 3, 2};

        // int longest = longestSequence(a);
        int longest = longestSequencebetter(a);
        System.out.println(longest);
    }
}
