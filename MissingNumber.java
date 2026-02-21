public class MissingNumber {
    static int missing(int[] arr){
    // ---------------------- brute force ----------- O(n2)
        for(int i = 1; i< arr.length+1; i++){
            boolean found  =false;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == i){
                    found = true;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(missing(arr));
    }
}
