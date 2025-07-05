package StriversArraysAndHashing;

public class BuyAndSellStock {

    public static void main(String[] args) {
        int[] arr = {1,5,7,3,4,8,9,2,2,5};
        System.out.println(findMaxProfit(arr));
    }

    private static int findMaxProfit(int[] arr) {
        int maxProfit = 0;
        int min = arr[0];
        for(int i =0; i < arr.length; i++){
            int profit = arr[i]-min;
            maxProfit = Math.max(maxProfit, profit);
            min = Math.min(min, arr[i]);
        }

        return maxProfit;
    }
}
