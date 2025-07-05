package StriversArraysAndHashing;

import java.util.Arrays;

public class UnionOfSortedArrays {
    public static void main(String[] args) {
        int []arr = {1,5,7,20,0,9,0,0,3,4,7};
        int []sec = {10,20,30,540,1,3,13};
        findUnionOfSortedArrays(arr,sec);
    }

    private static void findUnionOfSortedArrays(int[] arr, int[] sec) {
        Arrays.sort(arr);
        Arrays.sort(sec);
        int sizeOfArr = arr.length;
        int sizeOfSec = sec.length;
        int startIndexOfArr = 0;
        int startIndexOfSec = 0;
        int startIndexOfUnion = 0;
        int []union = new int[sizeOfArr + sizeOfSec - 2];

        while(startIndexOfArr < sizeOfArr && startIndexOfSec < sizeOfSec){
            if(arr[startIndexOfArr] < sec[startIndexOfSec]){
                if(startIndexOfUnion == 0 || arr[startIndexOfArr] != sec[startIndexOfSec]){
                    union[startIndexOfUnion] = arr[startIndexOfArr];
                    startIndexOfUnion++;
                }
                startIndexOfArr++;
            }
            else if(sec[startIndexOfSec] <= arr[startIndexOfArr]){
                   if(startIndexOfUnion == 0 || arr[startIndexOfArr] != sec[startIndexOfSec]){
                    union[startIndexOfUnion] = sec[startIndexOfSec];
                    startIndexOfUnion++;
                }  
                startIndexOfSec++;
            }
        }

        while(startIndexOfArr < sizeOfArr){
            union[startIndexOfUnion] = arr[startIndexOfArr];
            startIndexOfArr++;
            startIndexOfUnion++;
        }

        while(startIndexOfSec < sizeOfSec){
            union[startIndexOfUnion] = sec[startIndexOfSec];
            startIndexOfSec++;
            startIndexOfUnion++;
        }

        for(int i = 0; i < union.length; i++){
            System.out.print(union[i] + " ");
        }
    }
}
