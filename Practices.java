public class Practices {
    static int missing(int[] arr){
    // --------------- btute force ------------
        // for(int i = 1; i< arr.length+1; i++){
        //     boolean found  =false;
        //     for (int j = 0; j < arr.length; j++) {
        //         if(arr[j] == i){
        //             found = true;
        //             break;
        //         }
        //     }
        //     if(!found){
        //         return i;
        //     }
        // }
        // return -1;

    // ---------------- by sum of n number ------------
        // int n=arr.length +1;
        // int sum = 0;
        // for (int i = 0; i < n-1; i++) {
        //     sum += arr[i];
        // }
        // int expSum = (n*(n+1)) / 2;
        // int missing = expSum - sum;
        // return missing;

    // --------------- by XOR operation --------------
        int n = arr.length + 1;
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < n - 1; i++) {
            xor2 ^= arr[i];
        }
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }
        return xor1 ^ xor2;

    }
    static int maxSubArray(int[] nums) {
    // ------------- brute force -------------
        // int ms = Integer.MIN_VALUE;
        // for(int i =0; i<nums.length; i++){
        //     for(int j = i; j<nums.length; j++){
        //         int cs = 0;
        //         for(int k=i; k<=j; k++){
        //             cs += nums[k];
        //         }
        //         ms = Math.max(ms, cs);
        //     }
        // }
        // return ms;


    // ----------- better ----------------
        // int ms = Integer.MIN_VALUE;
        // for(int i =0; i<nums.length; i++){
        //     int cs = 0;
        //     for(int j = i; j<nums.length; j++){
        //         cs += nums[j];
        //         ms = Math.max(ms, cs);
        //     }
        // }
        // return ms;


    // -------------optimal -------------
        // int ms = Integer.MIN_VALUE;
        // int cs = 0;
        // for(int i =0; i<nums.length; i++){
        //     cs += nums[i];
        //     if(cs > ms){
        //         ms = cs;
        //     }if(cs<0){
        //         cs = 0;
        //     }
        // }
        // return ms;

          // --------------- follow up ---------------

        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int start = 0;
        int arrStart = -1, arrEnd = -1;
        for(int i =0; i<nums.length; i++){
            if(cs == 0){
                start = i;
            }
            cs += nums[i];
            if(cs > ms){
                ms = cs;
                arrStart = start;
                arrEnd = i;
            }if(cs<0){
                cs = 0;
            }
        }
        return ms;

    }
    public static void main(String[] args) {

        // q43 find missing number in an consecuetive array

        // int[] arr = {8, 2, 4, 5, 3, 7, 1};
        // System.out.println(missing(arr));


        // kadan's algo
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum =maxSubArray(arr);
        System.out.println("The maximum subarray sum is: " + maxSum);



    }
}
