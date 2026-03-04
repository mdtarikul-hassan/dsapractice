public class CountUniqueElement {
    static int countDistinct(int[] arr){
    // ----------------- brute force approach ---------------- O(n2)
        int n= arr.length;
        int count = 1;
        for(int i = 1; i< n; i++){
            int j;
            for(j = 0; j< i; j++){
                if(arr[i] == arr[j]){
                    break;
                }
            }
            if(i == j){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = { 6, 10, 5, 4, 9, 120, 4, 6, 10 };
        System.out.println(countDistinct(arr));
    }
}
