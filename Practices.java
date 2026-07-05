
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Practices {
    static int missing(int[] arr){
    // --------------- btute force ------------
        // for(int i = 1; i< arr.length+1; i++){
        //     boolean found  =false;
        //     for (int j = 0; j < arr.length; j++) {
        //         if(arr[j] == i){
        //             found = true;
        //             break;
        //         }
        //     }
        //     if(!found){
        //         return i;
        //     }
        // }
        // return -1;

    // ---------------- by sum of n number ------------
        // int n=arr.length +1;
        // int sum = 0;
        // for (int i = 0; i < n-1; i++) {
        //     sum += arr[i];
        // }
        // int expSum = (n*(n+1)) / 2;
        // int missing = expSum - sum;
        // return missing;

    // --------------- by XOR operation --------------
        int n = arr.length + 1;
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < n - 1; i++) {
            xor2 ^= arr[i];
        }
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }
        return xor1 ^ xor2;

    }
    static int maxSubArray(int[] nums) {
    // ------------- brute force -------------
        // int ms = Integer.MIN_VALUE;
        // for(int i =0; i<nums.length; i++){
        //     for(int j = i; j<nums.length; j++){
        //         int cs = 0;
        //         for(int k=i; k<=j; k++){
        //             cs += nums[k];
        //         }
        //         ms = Math.max(ms, cs);
        //     }
        // }
        // return ms;


    // ----------- better ----------------
        // int ms = Integer.MIN_VALUE;
        // for(int i =0; i<nums.length; i++){
        //     int cs = 0;
        //     for(int j = i; j<nums.length; j++){
        //         cs += nums[j];
        //         ms = Math.max(ms, cs);
        //     }
        // }
        // return ms;


    // -------------optimal -------------
        // int ms = Integer.MIN_VALUE;
        // int cs = 0;
        // for(int i =0; i<nums.length; i++){
        //     cs += nums[i];
        //     if(cs > ms){
        //         ms = cs;
        //     }if(cs<0){
        //         cs = 0;
        //     }
        // }
        // return ms;

          // --------------- follow up ---------------

        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int start = 0;
        int arrStart = -1, arrEnd = -1;
        for(int i =0; i<nums.length; i++){
            if(cs == 0){
                start = i;
            }
            cs += nums[i];
            if(cs > ms){
                ms = cs;
                arrStart = start;
                arrEnd = i;
            }if(cs<0){
                cs = 0;
            }
        }
        return ms;

    }
    public static int largestElem(int[] arr){
        // brute force O(nlogn)
        Arrays.sort(arr);
        return arr[arr.length-1];

        // optimal O(n)
        // int largeValue = Integer.MIN_VALUE;
        // for(int i = 0; i<arr.length; i++){
        //     if(arr[i] > largeValue){
        //         largeValue = arr[i];
        //     }
        // }
        // return largeValue;
    }

    public static int secondLargestElem(int[] arr){
        // brute force O(nlogn)
        // Arrays.sort(arr);
        // return arr[arr.length-2];

        // optimal O(n)
        int largeValue = Integer.MIN_VALUE;
        int secLargeValue = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largeValue){
                largeValue = arr[i];
            }
            if(arr[i] > secLargeValue && arr[i] < largeValue){
                secLargeValue = arr[i];
            }
        }
        return secLargeValue;
    }

    public static boolean checkSortedArray(int[] arr){
        // brute force O(n2)
        // for(int i = 0; i< arr.length; i++){
        //     for(int j = i+1; j<arr.length; j++){
        //         if(arr[i] > arr[j]){
        //             return false;
        //         }
        //     }
        // }


        //optimal O(n)
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }

        return true;
    }

    public static int removeDuplicate(int[] arr){
        // brute force O(n)
        int i=0;
        for(int j = 1; j< arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }

    public static ArrayList<Integer> removeDuplicateFromUnsorted(int[] arr){
        // breute force O(n2)
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i = 0; i< arr.length; i++){
        //     boolean found = false;
        //     for(int j = 0; j< list.size(); j++){
        //         if(arr[i] == list.get(j)){
        //             found = true;
        //             break;
        //         }
        //     }
        //     if(!found){
        //         list.add(arr[i]);
        //     }
        // }


        //optimal O(n)
        HashMap<Integer, Boolean> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                list.add(arr[i]);
                map.put(arr[i], true);
            }
        }
        return list;
    }

    public static int[] leftRotateByOne(int[] arr){
        // optimal O(n)
        int temp = arr[0];
        for(int i = 0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        return arr;
    }
    public static int[] leftRotateByk(int[] arr,int k){
        //optimal O(n)
        int[] temp = new int[k];
        for(int i = 0; i<k;i++){
            temp[i] = arr[i];
        }
        for(int i = 0; i<arr.length-k; i++){
            arr[i] = arr[i+k];
        }
        for(int i = arr.length-k; i<arr.length; i++){
            arr[i] = temp[i+k-arr.length];
        }
        return arr;
    }
    public static int[] movesZerosToEnd(int[] arr){
        // brute force O(n)
        int[] temp = new int[arr.length];
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                temp[j] = arr[i];
                j++;
            }
        }
        for(int i = 0; i<=j; i++){
            arr[i] = temp[i];
        }
        for(int i = j+1; i<arr.length; i++){
            arr[i] = 0;
        }
        return arr;
    }

    public static void print1ToN(int current, int k){
        if(current > k){
            return;
        }
        System.out.print(current + " ");
        print1ToN(current+1, k);
        
    }
    public static int sumofArray(int[] arr, int size){
        if(size == 0){
            return 0;
        }
        return arr[size-1] + sumofArray(arr, size-1);
    }

    public static void reverseArray(int[] arr, int start,int end){
        if(start >= end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        reverseArray(arr, start+1, end-1);
    }
    public static int largestElement(int[] l) {
        int large = Integer.MIN_VALUE;
        for(int i: l){
            if(i > large){
                large = i;
            }
        }
        return large;
    }
    public static int secLargestElement(int[] s){
        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        for(int i : s){
            if(i > l){
                l = i;
            }
            if(i>sl && i<l){
                sl = i;
            }
        }
        return sl;
    }
    public static boolean checkSortedArr(int[] arr){
        Boolean check = false;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                check = true;
            }
        }
        return check;
    }
    public static void main(String[] args) {

        // q43 find missing number in an consecuetive array

        // int[] arr = {8, 2, 4, 5, 3, 7, 1};
        // System.out.println(missing(arr));


        // kadan's algo
        // int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        // int maxSum =maxSubArray(arr);
        // System.out.println("The maximum subarray sum is: " + maxSum);

        // q13 largest element
        // int largeArr[] = {2, 5, 1, 3, 0};
        // System.out.println("Largest value is : "+largestElem(largeArr));
        // System.out.println("Largest value is : "+largestElem(largeArr));


        // q14 second largest element
        // int arr[] = {2, 5, 1, 3, 0};
        // System.out.println("Second Largest value is : "+secondLargestElem(arr));
        // System.out.println("Second Largest value is : "+secLargestElement(arr));


        // q15 check sorted array
        int arr[] = {1,2,3,4,5,7,8};
        if(checkSortedArr(arr)){
            System.out.println("Array is Sorted.");
        }else{
            System.out.println("Array is not sorted");
        }


        // q16 remove duplicate from sorted array
        // int arr[] = {1,2,2,3,4,4,4,4,5,5,6,8};
        // int k = removeDuplicate(arr);
        // for(int i = 0; i< k; i++){
        //     System.out.print(arr[i] +" ");
        // }

        // q26 remove duplicate from unsorted array
        // int arr[] = {1,4,4,4,2,3,3,3,4,2,1,7,7,7,3,1,8,8,4,2,4,1,4,3,1};
        // ArrayList<Integer> list = removeDuplicateFromUnsorted(arr);
        // for(int l:list){
        //     System.out.print(l +" ");
        // }


        // q17 left rotate by 1
        // int[] arr = {1,4,2,5,7,8};
        // int[] ans = leftRotateByOne(arr);
        // for(int i : ans){
        //     System.out.print(i + " ");
        // }


        // q18 left rotate by k
        // int[] arr = {1,4,2,5,7,8};
        // int[] ans = leftRotateByk(arr, 3);
        // for(int i : ans){
        //     System.out.print(i + " ");
        // }


        // q19 moves zeros to end
        // int[] arr = {1,4,0,2,7,0,7,0,3,0,5,0,0,2,1,0,9};
        // int[] ans = movesZerosToEnd(arr);
        // for(int i: ans){
        //     System.out.print(i + " ");
        // }


        // q123 print numbers using recursion
        // int k = 7;
        // print1ToN(1, k);


        // q124 sum of array using recursion
        // int[] arr = {1,5,3,6,2,7};
        // int size = arr.length;
        // System.out.println("sum : "+ sumofArray(arr, size));
        
        // q125 reverse array using recursion
        // int[] arr = {2,5,1,4,3,6};
        // int end = arr.length-1;
        // reverseArray(arr, 0, end);
        // for( int i: arr){
        //     System.out.print(i + " ");
        // }

    }
}
