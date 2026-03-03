public class HighestandLowestFrequency {
    static void countFrequency(int[] arr){
    // ------------------- brute force approach ---------------- O(n2)
        int n = arr.length;
        boolean[] visited = new boolean[n];
        int maxFre = 0, maxEle = 0;
        int minFre = n, minEle = 0;
        for(int i = 0; i< n; i++){
            if(visited[i]){
                continue;
            }
            int count = 1;
            for(int j = i+1; j< n; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            if(count > maxFre){
                maxEle = arr[i];
                maxFre = count;
            }
            if(count < minFre){
                minEle = arr[i];
                minFre = count;
            }
        }
        System.out.println("Element of max Frequency : "+maxEle);
        System.out.println("Element of min Frequency : "+minEle);
    }
    public static void main(String[] args) {
        int arr[] = {10, 5, 10, 15, 10, 5};
        countFrequency(arr);
    }
}
