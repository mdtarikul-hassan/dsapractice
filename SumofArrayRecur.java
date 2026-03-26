public class SumofArrayRecur {
    public int sumofArray(int N){
    // ---------------------- brute force approach ----------------- O(n)
        // int sum = 0;
        // for(int i = 1; i<=N; i++){
        //     sum = sum +i;
        // }
        // return sum;

    
    // -------------------- recursive approach ------------ 
        if(N == 1){
            return 1;
        }
        return N+sumofArray(N -1);
    }
    public static void main(String[] args) {
        int N = 5;
        SumofArrayRecur obj = new SumofArrayRecur();
        System.out.println(obj.sumofArray(N));
    }
}
