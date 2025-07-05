package StriversArraysAndHashing;

import java.util.Arrays;
import java.util.Collections;

//Here the thinking is as follows
/*2154300 -- 2354100 --2300145
 * 1. we find out the index of the array where we see that arr[i] > arr[i-1] starting from i = n-1
 * 2. then we replace the element with the smallest in the right which is greater than the element
 * 3. then we rearrange the digits to the right to fetch the smallest number in the right
 */
public class NextPermutation {

    public static void main(String[] args) {
        int number = 2154300;

        int[] arr = convertNumToArray(number);
        // for(int i : arr){
        //     System.out.print(i +  " ,");
        // }
        int nextPermutatedNumber = findNextPermutation(arr);
    }

    private static int findNextPermutation(int[] arr) {
        int index = arr.length-1;
        while(index > 0){
            if(arr[index] > arr[index-1])
                break;
                index--;
        }
                index--;
                if(index == -1){
                    
                }
        int i = 0;
        for(i = arr.length-1;i > index; i--){
            if(arr[i] > arr[index]){
                break;
            }
        }

        swap(i, index, arr);

        Integer[] copyArray = Arrays.stream(arr, index+1, arr.length).boxed().toArray(Integer[]::new);
        Arrays.sort(copyArray);

        for(int k = 0; k < copyArray.length; k++){
            arr[index + k + 1] = copyArray[k]; 
        }

        int res = 0;
        for(int digit : arr)
            res = res*10 + digit;
        return res;

    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    private static int[] convertNumToArray(int number) {
        int index = 0;
        int temp = number;
        while(temp > 0){
            temp = temp/10;
            index++;
        }
        int[] res = new int[index];
        index--;
        while(number > 0 && index >= 0){
            res[index] = number%10;
            number /= 10;
            index--;
        }
        
        return res;
    }
}
