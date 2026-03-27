public class ReverseArray {
// ------------------ reverse array using recursion ---------------
    public void reverseArray(int[] arr,  int i){
        int n = arr.length;
        if(i > n-i-1){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        reverseArray(arr, i+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ReverseArray obj = new ReverseArray();
        obj.reverseArray(arr, 0);

        for(int num : arr){
            System.out.print(num +" ");
        }
    }
}
