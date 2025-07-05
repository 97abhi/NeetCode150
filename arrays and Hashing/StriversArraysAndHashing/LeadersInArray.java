package StriversArraysAndHashing;

import java.util.Arrays;

public class LeadersInArray {

    public static void main(String[] args) {
        int[] arr = {1,9,4,5,7,1,2,1,4};

        findLeaders(arr);
    }

    private static void findLeaders(int[] arr) {
       int max = Integer.MIN_VALUE;
        int n = arr.length;
        int index = 0;
        int[] res = new int[arr.length];
       for(int i = n-1; i > 0; i-- ){
        if(arr[i] > max){
            res[index] = arr[i];
            index++;
        }
        max = Math.max(max, arr[i]);
       }
       for(int i : res){
        System.out.println(i);
       }
    }
}
