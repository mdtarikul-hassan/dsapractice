
public class SecondLargestElement {
    static void getElements(int[] arr, int n) {
    // -------------------- brute force ------------- O(nlong)
        // if (n == 0 || n == 1) {
        //     System.out.println(-1 + " " + -1);  
        //     return;
        // }
        // Arrays.sort(arr);
        // int small = arr[1];
        // int large = arr[n - 2];

        // System.out.println("Second smallest is " + small);
        // System.out.println("Second largest is " + large);

    // ---------------------- better approach -------------- O(n)
        // if (n == 0 || n == 1) {
        //     System.out.println(-1 + " " + -1);
        //     return;
        // }
        // int small = Integer.MAX_VALUE, second_small = Integer.MAX_VALUE;
        // int large = Integer.MIN_VALUE, second_large = Integer.MIN_VALUE;
        // for (int i = 0; i < n; i++) {
        //     small = Math.min(small, arr[i]);
        //     large = Math.max(large, arr[i]);
        // }
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] < second_small && arr[i] != small) {
        //         second_small = arr[i];
        //     }
        //     if (arr[i] > second_large && arr[i] != large) {
        //         second_large = arr[i];
        //     }
        // }
        // System.out.println("Second smallest is " + second_small);
        // System.out.println("Second largest is " + second_large);

    }

    // ------------------ optimal ------------  O(n)
    public static int secondSmallest(int[] arr, int n) {
        if (n < 2)
            return -1;
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                second_small = small;
                small = arr[i];
            } 
            else if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
        }
        return second_small;
    }

    public static int secondLargest(int[] arr, int n) {
        if (n < 2)
            return -1;
        int large = Integer.MIN_VALUE, second_large = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            } 
            else if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        return second_large;
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 4, 6, 7, 5};
        int n = arr.length;
        getElements(arr, n);
        // ----- for optimal ----
        int sS =secondSmallest(arr, n);
        int sL =secondLargest(arr, n);
        System.out.println("Second smallest is " + sS);
        System.out.println("Second largest is " + sL);
    }
}
