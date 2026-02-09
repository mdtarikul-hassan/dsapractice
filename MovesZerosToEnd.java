public class MovesZerosToEnd {
    public static int[] moveZeroes(int[] arr) {
    // ---------------- brute force -------------
        // int[] temp = new int[arr.length];
        // int index = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] != 0) {
        //         temp[index] = arr[i];
        //         index++;
        //     }
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = temp[i];
        // }
        // return arr;


// ----------------- optimal -------------
        int j = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) return arr;
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        int[] result = moveZeroes(arr);

        System.out.print("Array after moving zeroes: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
