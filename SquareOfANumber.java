public class SquareOfANumber {
    static int sqrt(int target){
    // --------------- brute force --- O(n)
        int ans = 0;
        for(int i = 1; i< target/2; i++){
            if((long)i*i <= target){
                ans = i;
            }
            else{
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(27));
    }
}
