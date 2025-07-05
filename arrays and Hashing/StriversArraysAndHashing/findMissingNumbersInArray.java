package StriversArraysAndHashing;

public class findMissingNumbersInArray {

    public static void main(String[] args) {
        int []arr = {1,2,4,5,6,7,8,9};

        // System.out.println(missingNmber(arr));
        System.out.println(missingNmber2(arr));
    }

    private static int missingNmber(int[] arr) {
    int sumOfNNumber = ((arr.length+1) * (arr.length + 1+1))/2;
    System.out.println(sumOfNNumber);
    int totalSum = 0;
        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }
        System.out.println(totalSum);
        return sumOfNNumber - totalSum;
    }

    private static int missingNmber2(int[] arr){
        // first we xor all the natural numbers from 1 to 9
        //then we xor all the numbers in the array
        //then we xor the first 2 we will get the missing numbers as all the common elements xor will be 0 and will cancel each other
        int xor1 = 0, xor2 = 0;
        for(int i = 0; i < arr.length; i++){
            xor1 = xor1 ^ arr[i];
            xor2 = xor2 ^ (i+1);
        }
        xor2 = xor2^arr.length+1;
        return xor1 ^ xor2;
    }
}
