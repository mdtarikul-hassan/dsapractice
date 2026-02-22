public class SortZerosOnesTwos {
    static int[] sortZeroOneTwo(int[] arr){
    // -------------------- brute force -------------- O(n)
        // int count0 = 0, count1 = 0, count2 = 0;
        // for(int num : arr){
        //     if(num == 0){
        //         count0++;
        //     }else if(num == 1){
        //         count1++;
        //     }else{
        //         count2++;
        //     }
        // }
        // int idx = 0;
        // while(count0-- > 0){
        //     arr[idx++] = 0;
        // }
        // while(count1-- > 0){
        //     arr[idx++] = 1;
        // }
        // while(count2-- > 0){
        //     arr[idx++] = 2;
        // }

        // return arr;

    // ---------------- optimal by  Dutch National Flag algorithm ----------- O(n)
    int low = 0, mid = 0, high = arr.length -1;
    while(mid <= high){
        if(arr[mid] == 0){
            int temp = arr[mid];
            arr[mid] = arr[low];
            arr[low] = temp;
            low++;
            mid++;
        }else if(arr[mid] == 1){
            mid++;
        }else{
            int temp = arr[mid];
            arr[mid] = arr[high];
            arr[high] = temp;
            high--;
        }
    }

    return arr;
    }
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 1, 0};
        int[] newArr = sortZeroOneTwo(nums);

        for(int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
