package StriversArraysAndHashing;

import java.util.Arrays;

public class IntersectionOfSortedArrays {

    public static void main(String[] args) {
        int []arr = {1,5,7,20,0,9,0,0,3,4,7};
        int []sec = {10,20,30,540,1,3,13};
        findIntersectionOfSortedArray(arr,sec);
    }

    private static void findIntersectionOfSortedArray(int[] arr, int[] sec) {

        Arrays.sort(arr);
        Arrays.sort(sec);
        int i = 0, j = 0, k = 0;
        int[] res = new int[arr.length + sec.length-2];
        while(i < arr.length && j < arr.length){

            if(arr[i] < sec[j])
                i++;
            
            else if(sec[j]  < arr[i])
                j++;

            else{
                res[k] = arr[i];
                k++;
                i++;
                j++;
            }
                
        }
        for(int in = 0; in < res.length; in++){
            System.out.print(res[in] + " ");
        }
    }
}
