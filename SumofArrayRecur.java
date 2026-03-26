public class SumofArrayRecur {
    public int sumofArray(int N){
    // ---------------------- brute force approach ----------------- O(n)
        int sum = 0;
        for(int i = 0; i<N; i++){
            sum = sum +i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int N = 5;
        SumofArrayRecur obj = new SumofArrayRecur();
        System.out.println(obj.sumofArray(N));
    }
}
