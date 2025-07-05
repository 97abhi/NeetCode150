package StriversArraysAndHashing;

public class SecondSmallestAndLargest {

    public static void main(String[] args) {
        int []arr = {10,20,30,540,1,3,13};

        System.out.println(findSecondSmallest(arr));
        System.out.println(findSecondLargest(arr));
    }

    private static int findSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i= 0; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }

            else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

        private static int findSecondSmallest(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for(int i= 0; i < arr.length; i++){
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }

            else if(arr[i] > smallest && arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }

}
