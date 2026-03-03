import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequencyofElements {
    static ArrayList<ArrayList<Integer>> countFrequency(int[] arr){
    // --------------------- brute force approach ---------------- O(n2)
        // int n = arr.length;
        // ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        // boolean[] visited = new boolean[n];

        // for(int i = 0; i< n; i++){
        //     if(visited[i]){
        //         continue;
        //     }
        //     int count = 1;
        //     for(int j= i+1; j< n; j++){
        //         if(arr[i] == arr[j]){
        //             visited[j]= true;
        //             count++;
        //         }
        //     }
        //     ArrayList<Integer> temp = new ArrayList<>();
        //     temp.add(arr[i]);
        //     temp.add(count);
        //     ans.add(temp);
        // }
        // return ans;

    // --------------------- better by binary search ---------------- O(nlogn)
        // Arrays.sort(arr);
        // ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        // int n = arr.length;
        // int i = 0;
        // while(i<n){
        //     int current = arr[i];
        //     int firstIdx = i;
        //     int lastIdx = i;
        //     while(lastIdx + 1 <n && arr[lastIdx+1] == current){
        //         lastIdx++;
        //     }
        //     int count = lastIdx - firstIdx +1;
        //     ArrayList<Integer> temp = new ArrayList<>();
        //     temp.add(current);
        //     temp.add(count);
        //     ans.add(temp);
        //     i = lastIdx + 1;
        // }
        // return ans;

    // ------------------ optimal by hashmap --------------- O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int val : arr){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            ans.add(temp);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {10, 5, 10, 15, 10, 5};

        ArrayList<ArrayList<Integer>> ans = countFrequency(arr);
        for(ArrayList<Integer> val : ans){
            System.out.println(val);
        }
    }
}
