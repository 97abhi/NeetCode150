package StriversArraysAndHashing;
/*
 * The mistake initially I did was 
 * 1. we need to increase the left only if sum is out of range , to bring it back to range
 * 2. once the max length is calculated then we need to check if right is within array's limits
 * only then we updayte the sum, otherwise we get arrayOutOfBoundsException.
 */



public class longestSubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,2,5,8,5};

        System.out.println(findLongestSub(arr, 10));
    }

    private static int findLongestSub(int[] arr, int i) {
        int left = 0, right = 0;
        int sum = arr[0], maxLength = 0;
        while(right < arr.length){
            while(left <= right && sum > i){
                sum -= arr[left];
                left++;
            }
            if(sum == i) maxLength = Math.max(maxLength, right-left+1);
            right++;
            if(right < arr.length)  sum += arr[right];
        }
        return maxLength;
    }
}
