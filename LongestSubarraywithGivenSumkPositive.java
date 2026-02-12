public class LongestSubarraywithGivenSumkPositive{
    public int longestSum(int[] arr, int targetSum){
        int maxLength = 0;
        for(int i = 0; i< arr.length; i++){
            for(int j = i; j< arr.length; j++){
                int currentSum = 0;
                for(int k= i; k<= j; k++){
                    currentSum += arr[k];
                }
                if(currentSum == targetSum){
                    maxLength = Math.max(maxLength, j-i+1);
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int targetSum = 15;
        LongestSubarraywithGivenSumkPositive obj = new LongestSubarraywithGivenSumkPositive();
        int length = obj.longestSum(arr,targetSum);
        System.out.println("length of longest array is : "+length);
    }
}