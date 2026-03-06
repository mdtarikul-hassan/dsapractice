public class LongestConsecutiveSequence {
// ------------------- better approach ----------- O(n2)
    static boolean linearSearch1(int[] arr, int x){
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == x){
                return true;
            }
        }
        return false;
    }
    static int longestSequence(int[] arr){
        int n = arr.length;
        if(n == 0){
            return 0;
        }
        int longest = 1;
        for(int i = 0; i< n; i++){
            int count = 1;
            int x = arr[i];
            while (linearSearch1(arr, x+1) == true) { 
                x++;
                count++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] a = {100, 4, 200, 1, 3, 2};

        int longest = longestSequence(a);
        System.out.println(longest);
    }
}
