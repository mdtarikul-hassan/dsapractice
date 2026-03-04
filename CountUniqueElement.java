import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CountUniqueElement {
    static int countDistinct(int[] arr){
        // ************ count distinct / unique element in an array ****************

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
        // int n= arr.length;
        // Arrays.sort(arr);
        // int count = 1;
        // for(int i = 0; i< n; i++){
        //     while(i < n-1 && arr[i] == arr[i+1]){
        //         i++;
        //     }
        //     count++;
        // }
        // return count;

    // --------------- optimal approach usinh HashSet -----------------
        HashSet<Integer> set = new HashSet<>();
        for(int val : arr){
            set.add(val);
        }
        return set.size();
    }


        

        // ******************* Count Distinct Elements In Every Window *****************

    // ------------------- brute force approach ------------ O(n3) == O(k2*n)
    static int window(int[] arr, int start, int k){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i< k; i++){
            int j;
            for( j = 0; j< i; j++){
                if(arr[start + i] == arr[start +j]){
                    break;
                }
            }
            if(j == i){
                count++;
            }
        }
        return count;
    }
    static void counrSlidingWindow(int[] arr, int k){
        int n = arr.length;
        for(int i = 0; i<= n-k; i++){
            System.out.print(window(arr, i, k) + " ");
        }
    }

    // ------------------ optimal by Hashing -------------
    static int countDistinctWindow(int[] arr, int k){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int i = 0, j = 0;
        while(j < n){
            map.put(arr[j],map.getOrDefault(arr[j], 0) + 1);
            if(j-i+1 == k){
                list.add(map.size());
                
                map.put(arr[i], map.get(arr[i]) -1);
                if(map.get(arr[i]) == 0){
                    map.remove(arr[i]);
                }

                i++;
            }
            j++;
        }
        for(int val : list){
            System.out.print(val + " ");
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 10, 5, 4, 9, 120, 4, 6, 10 };
        int k = 4;
        System.out.println(countDistinct(arr));
        counrSlidingWindow(arr,k);
        System.out.println();
        countDistinctWindow(arr,k);

    }
}
