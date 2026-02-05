class KadansAlgo {
    public int maxSubArray(int[] nums) {
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
        // for print the subarray
        // System.out.println("Ther subarray is : [");
        // for(int i = arrStart; i<=arrEnd; i++){
        //     System.out.println(nums[i] + " ");
        // }
        // System.out.println("]");
        return ms;

    }
    public static void main(String[] args){
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};

        KadansAlgo sol = new KadansAlgo();

        int maxSum = sol.maxSubArray(arr);

        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}