import java.util.ArrayList;

public class FrequencyofElements {
    static ArrayList<ArrayList<Integer>> countFrequency(int[] arr){
    // --------------------- brute force approach ---------------- O(n2)
        int n = arr.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        boolean[] visited = new boolean[n];

        for(int i = 0; i< n; i++){
            if(visited[i]){
                continue;
            }
            int count = 1;
            for(int j= i+1; j< n; j++){
                if(arr[i] == arr[j]){
                    visited[j]= true;
                    count++;
                }
            }
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(arr[i]);
            temp.add(count);
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
