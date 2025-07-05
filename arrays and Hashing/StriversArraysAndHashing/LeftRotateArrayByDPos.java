package StriversArraysAndHashing;

import java.util.Arrays;
import java.util.Collection;

public class LeftRotateArrayByDPos {

    public static void main(String[] args) {
        int arr[] = {10,20,30,540,1,3,13};

        leftRotateByDPos(arr, 1);
        rightRotateByDPos(arr, 1);
    }


    //here swap a- d, d - n and then reverse the entire array 
    private static void leftRotateByDPos(int[] arr, int d) {

        swap(arr, 0, d-1);
        swap(arr, d, arr.length-1);
        swap(arr, 0, arr.length-1);

        for(int ele : arr)
            System.out.print(ele + " , ");

        System.out.println();

    }

      private static void rightRotateByDPos(int[] arr, int d) {

        swap(arr, arr.length-d, arr.length-1);
        swap(arr, 0, arr.length-d-1);
        swap(arr, 0, arr.length-1);

        for(int ele : arr)
            System.out.print(ele + " , ");

        System.out.println();

    }


    private static void swap(int[] arr, int s, int d) {
       while(s < d){
        int temp;
        temp = arr[s];
        arr[s] = arr[d];
        arr[d] = temp;

        s++;
        d--;
       }
    }


}
