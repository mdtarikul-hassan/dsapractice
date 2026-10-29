

public class RearrangeArraybySign {
    static int[] RearrangeArray(int[] arr){
    // ------------------ brute force ------------------- O(n+n/2) = O(n)
        // List<Integer> pos = new ArrayList<>();
        // List<Integer> neg = new ArrayList<>();

        // for(int i = 0; i< arr.length; i++){
        //     if(arr[i] > 0){
        //         pos.add(arr[i]);
        //     }else{
        //         neg.add(arr[i]);
        //     }
        // }

        // for(int i = 0; i< pos.size(); i++){ // for pos.size() == neg.size()
        //     arr[2*i] = pos.get(i);
        //     arr[2*i + 1] = neg.get(i);
        // }
        // return arr;
    
    // ---------------------- optimal ---------------- O(n)
        int[] ans = new int[arr.length];
        int posIdx = 0, negIdx = 1;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > 0){
                ans[posIdx] = arr[i];
                posIdx = posIdx+2;
            }else{
               ans[negIdx] = arr[i];
                negIdx = negIdx+2;
            }
        }
        return ans;
    }
    // ------------------- another way ---------------- O(n)
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length];
        int[] neg = new int[nums.length];
        int[] temp = new int[nums.length];
        int pi = 0;
        int ni = 0;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] > 0){
                pos[pi] = nums[i];
                pi++;
            }else{
                neg[ni] = nums[i];
                ni++;
            }
        }

        pi = 0;
        ni = 0;

        for(int i = 0; i< nums.length; i=i+2){
            temp[i] = pos[pi];
            pi++;
        }

        for(int i = 1; i< nums.length; i=i+2){
            temp[i] = neg[ni];
            ni++;
        }

        return temp;
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
