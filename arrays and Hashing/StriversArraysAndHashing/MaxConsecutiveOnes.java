package StriversArraysAndHashing;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] arr = {2,1,1,1,1,4,5,6,2,1,1,3,54,1,1,1,1,1};

        System.out.println(findMaxConsecutiveOnes(arr));
    }

    private static int findMaxConsecutiveOnes(int[] arr) {
        int count = 0, maxCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                count++;
            }
            else{
                maxCount = Math.max(maxCount, count);
                count= 0;
            }
        }

        maxCount = Math.max(maxCount, count);

        return maxCount;
    }

}
