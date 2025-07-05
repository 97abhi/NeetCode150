package StriversArraysAndHashing;


//we use the algorithm called Dutch National Flag Algorithm
/*
 * The algorithm states that at any given point we sort the values from mid+1 to high
 * and at any given point low to mid-1 will be sorted with 0. and high+1 to n-1 will be 2's

    mistake I did first time was I increased mid when swapping with high, but we dont need to 
    increase mid as we dont know what value did high contain, if its 1 there is a condition to 
    take care of it but if its 0 then we need to swap it again from low. 
    So just decrease high and leave mid as it is.

 */
public class SortZeroesOnesAndTwos {

    public static void main(String[] args) {
        int []arr = { 0,1,2,2,2,2,1,1,1,0,0,0,1};

        printSortedArr(arr);

    }

    private static void printSortedArr(int[] arr) {
       
        int mid = 0;
        int low = 0;
        int high = arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr, mid, high);
                high--;
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void swap(int[] arr, int low, int mid) {
       int temp = arr[mid];
       arr[mid]  = arr[low];
       arr[low] = temp;
    }

}
