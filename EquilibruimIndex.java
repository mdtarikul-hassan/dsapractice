public class EquilibruimIndex {
    static int equilibruimIndex(int[] nums){
    // ------------------- brute force approach ------------------ O(n2)
        // for(int i = 0; i<nums.length; i++){
        //     int ls = 0;
        //     int rs = 0;
        //     for(int j = 0; j<i; j++){
        //         ls += nums[j];
        //     }
        //     for(int j = i+1; j<nums.length; j++){
        //         rs += nums[j];
        //     }
        //     if(ls == rs){
        //         return i;
        //     }
        // }
        // return -1;

// ------------------ optimal ---------------- O(n)
        // int ls = 0, rs = 0, ts = 0;
        // for(int i = 0; i<nums.length; i++){
        //     ts += nums[i];
        // }
        // for(int i = 0; i<nums.length; i++){
        //     rs = ts-ls-nums[i];
        //     if(ls == rs){
        //         return i;
        //     }
        //     ls += nums[i];
        // }
        // return -1;


    // ------------------ optimal another way -------------- O(n)
        int ls = 0, rs = 0;
        for(int i = 0; i<nums.length; i++){
            rs += nums[i];
        }
        for(int i = 0; i<nums.length; i++){
            rs -=nums[i];
            if(ls == rs){
                return i;
            }
            ls += nums[i];
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = { 1,7,3,6,5,6};

        int i = equilibruimIndex(arr);
        System.out.println("Equilibruim Index is : "+i);
    }
}
