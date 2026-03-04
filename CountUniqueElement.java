import java.util.*;

public class CountUniqueElement {
    static int countDistinct(int[] arr){
    // ----------------- brute force approach ---------------- O(n2)
        // int n= arr.length;
        // int count = 1;
        // for(int i = 1; i< n; i++){
        //     int j;
        //     for(j = 0; j< i; j++){
        //         if(arr[i] == arr[j]){
        //             break;
        //         }
        //     }
        //     if(i == j){
        //         count++;
        //     }
        // }
        // return count;

    // ----------------- better approach by array sort -------------- O(nlogn)
        int n= arr.length;
        Arrays.sort(arr);
        int count = 1;
        for(int i = 0; i< n; i++){
            while(i < n-1 && arr[i] == arr[i+1]){
                i++;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = { 6, 10, 5, 4, 9, 120, 4, 6, 10 };
        System.out.println(countDistinct(arr));
    }
}
