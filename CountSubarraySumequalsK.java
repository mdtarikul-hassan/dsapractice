public class CountSubarraySumequalsK{
    static int countSubArray(int[] arr, int k){
    // ---------------- brute force ------------------ O(n3)
        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i; j < arr.length; j++) {
        //         int currSum = 0;
        //         for (int idx = i; idx <= j; idx++) {
        //             currSum += arr[idx];
        //         }
        //         if(currSum == k){
        //             count++;
        //         }
        //     }
        // }

        // return count;
    
    // ---------------- better approach ------------------ O(n2)
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum += arr[j];
                if(currSum == k){
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int count = countSubArray(arr, k);
        System.out.println("count is : " + count);
    }
}