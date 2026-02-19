
import java.util.ArrayList;
import java.util.List;

public class RearrangeArraybySign {
// ------------------ brute force ------------------- O(n+n/2) = O(n)
    static int[] RearrangeArray(int[] arr){
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int i = 0; i< arr.length; i++){
            if(arr[i] > 0){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }

        for(int i = 0; i< pos.size(); i++){ // for pos.size() == neg.size()
            arr[2*i] = pos.get(i);
            arr[2*i + 1] = neg.get(i);
        }


        return arr;
    }
    public static void main(String[] args) {
        int[] A = {1,2,-3,-1,-2,3};

        int[] result = RearrangeArray(A);
        System.out.print("New array is : [");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.print("]");
    }
}
