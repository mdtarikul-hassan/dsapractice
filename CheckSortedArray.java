public class CheckSortedArray {
    public boolean isSorted(int[] arr) {
    // --------------------- brute force ---------- O(n2)
        // int n= arr.length;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (arr[j] < arr[i]) 
        //             return false;
        //     }
        // }
        // return true;

    // -------------------- optimal ------------- O(n)
        int n= arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        CheckSortedArray obj = new CheckSortedArray();
        
        boolean ans = obj.isSorted(arr);
        
        if (ans) 
            System.out.println("True");
        else 
            System.out.println("False");
    }
}
