public class SquareOfANumber {
    static int sqrt(int target){
    // --------------- brute force --- O(n)
        // int ans = 0;
        // for(int i = 1; i< target/2; i++){
        //     if((long)i*i <= target){
        //         ans = i;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // return ans;
        
// ------------- optimal by binary search --------- O(logn)
        if (target == 0 || target == 1){
            return target;
        }
        int l = 1, r = target/2, ans = 0;
        while(l <= r){
            int m = (l+r)/2;
            if((long)m*m <= target){
                ans = m;
                l = m+1;
            }else{
                r = m-1;
            }
        }
        return ans;
    
    }

    public static void main(String[] args) {
        System.out.println(sqrt(27));
    }
}
