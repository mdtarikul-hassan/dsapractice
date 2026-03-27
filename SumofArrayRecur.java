public class SumofArrayRecur {
    // public int sumofArray(int N){
    // ---------------------- brute force approach ----------------- O(n)
        // int sum = 0;
        // for(int i = 1; i<=N; i++){
        //     sum = sum +i;
        // }
        // return sum;

    
    // -------------------- recursive approach ------------ 
        // if(N == 1){
        //     return 1;
        // }
        // return N+sumofArray(N -1);
    // }

    public int sumofArray(int[] arr){
    //  ----------------- brute force approach [sum of an array]-------------- O(n)
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum +arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,3,6,8,5,89};
        int N = 5;
        SumofArrayRecur obj = new SumofArrayRecur();
        System.out.println(obj.sumofArray(arr));
    }
}
