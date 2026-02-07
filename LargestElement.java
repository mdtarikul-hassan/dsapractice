import java.util.Arrays;

class Solution {
    // ------------ brute force ----------------
    public static int sortArr(int[] arr) {
        Arrays.sort(arr);
        
        return arr[arr.length - 1];
    }

    // ------------- optimsl -------------------
    public static int findLargestElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) { 
                max = arr[i];
            }
        }
        return max;
    }
}

public class LargestElement {

    public static void main(String[] args) {
        int[] arr1 = {2, 5, 1, 3, 0};
        int[] arr2 = {8, 10, 5, 7, 9};
        

        Solution sol = new Solution();
        
        System.out.println("The Largest element in the array is: " + sol.sortArr(arr1));
        System.out.println("The Largest element in the array is: " + sol.findLargestElement(arr2));
    }
}