package StriversArraysAndHashing;

public class Move0ToEnd {

    public static void main(String[] args) {
        int []arr = {1,5,7,20,0,9,0,0,3,4,7};
        printAfterMoving0ToEnd(arr);
    }

    private static void printAfterMoving0ToEnd(int[] arr) {
       int startPointer = -1; int endPointer = arr.length-1;

       for(int i = 0; i < arr.length; i++){
        if(arr[i] == 0){
            startPointer = i;
            break;
        }
       }

       for(int i = startPointer; i < arr.length; i++){
        if(arr[i] != 0){
            swap(startPointer, i, arr);
            startPointer++;
        }
       }

       if(startPointer == -1){
        System.out.println("No Zeroes in the array" );
        return;
       }

       for(int ele: arr){
        System.out.print(ele + " , ");
       }



    }

    private static void swap(int startPointer, int i, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[startPointer];
        arr[startPointer] = temp;
    }
}
