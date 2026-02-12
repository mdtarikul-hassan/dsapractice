public class LongestSubarraywithGivenSumkPositive{
    public int longestSum(int[] arr, int targetSum){
    // ------------------- brute force -------------
        // int maxLength = 0;
        // for(int i = 0; i< arr.length; i++){
        //     for(int j = i; j< arr.length; j++){
        //         int currentSum = 0;
        //         for(int k= i; k<= j; k++){
        //             currentSum += arr[k];
        //         }
        //         if(currentSum == targetSum){
        //             maxLength = Math.max(maxLength, j-i+1);
        //         }
        //     }
        // }
        // return maxLength;

    // -------------------- better one --------------------
        int maxLength = 0;
        for(int i = 0; i< arr.length; i++){
            int currentSum = 0;
            for(int j = i; j< arr.length; j++){
                currentSum += arr[j];
                if(currentSum == targetSum){
                    maxLength = Math.max(maxLength, j-i+1);
                }
            }
        }
        return maxLength;

    // -------------- optimal [sliding window] -----------------
        // int n = arr.length;
        // int maxLen = 0;
        // int left = 0, right = 0;

        // int sum = arr[0];
        // while (right < n) {
        //     while (left <= right && sum > targetSum) {
        //         sum -= arr[left];
        //         left++;
        //     }

        //     if (sum == targetSum) {
        //         maxLen = Math.max(maxLen, right - left + 1);
        //     }
        //     right++;
        //     if (right < n) {
        //         sum += arr[right];
        //     }
        // }

        // return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int targetSum = 15;
        LongestSubarraywithGivenSumkPositive obj = new LongestSubarraywithGivenSumkPositive();
        int length = obj.longestSum(arr,targetSum);
        System.out.println("length of longest array is : "+length);
    }
}