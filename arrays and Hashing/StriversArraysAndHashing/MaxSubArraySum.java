package StriversArraysAndHashing;


/*
 * Here we use an algorithm called Kadane's algorithm
 * we keep a counter called sum and max sum.
 * As we move forward if our sum decreases we assume one subset till there and then compare with max if its greater then max sum is updated
 * 
 */
public class MaxSubArraySum {

    public static void main(String[] args) {
        int[] arr = {1,2,4,-100,2,-4,5,6,-12,4,6,7};
        int startIndex = findMaxSubArraySum(arr)[0];
        int endIndex = findMaxSubArraySum(arr)[1];
        System.out.println("Start index of subarray with max sum is " + startIndex + " and the end index is " + endIndex);
    }

    private static int[] findMaxSubArraySum(int[] arr) {
        int sum = 0;
        int maxSum = 0;
        int start =0 , end = 0, ansStart = 0;
        for(int i = 0; i < arr.length; i++){
            if(sum == 0) start = i;
            sum += arr[i];
            if(sum > maxSum){
                maxSum = sum;
                ansStart = start;
                end = i;
            }
            if(sum < 0){
               sum = 0;
            }

        }
       return new int[]{ansStart, end};
    }

}
