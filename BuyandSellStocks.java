public class BuyandSellStocks {
    static int buyandSell(int[] arr){
    // ----------------- brute force approach --------- O(n2)
        int maxProfit = 0;
        for(int i = 0; i< arr.length; i++){
            int profit = 0;
            for(int j = i+1; j< arr.length; j++){
                profit = arr[j] - arr[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};
        int maxProfit = buyandSell(arr);
        System.out.println("max profit : "+maxProfit);

    }
}
