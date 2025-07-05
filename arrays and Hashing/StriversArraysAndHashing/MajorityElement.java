package StriversArraysAndHashing;


/*
 * The algorithm we use here is called Moore's algorithm and it goes like this
 * 1. We pick an element from an array and assume that its the majority element and we increase the counter.'
 * 2. If we encounter a diff element we subtract the counter, and if it goes to 0. we pick the next
 * element to be the greatest and perform the steps.
 * 3. At the end we just need to make sure that the element is infact the majority.
 */
public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {1,2,1,1,1,34,6,88,1};
        
        System.out.println(findMajorityElement(arr));
    }

    private static int findMajorityElement(int[] arr) {
       int element = 0;
       int count = 0;

       for(int i = 0; i < arr.length; i++){
        if(count == 0){
            element = arr[i];
            count++;
        }
        else if(element == arr[i]){
            count++;
        }
        else{
            count--;
        }
       }
       count = 0;
       for(int i = 0; i < arr.length; i++){
        if(arr[i] == element){
            count++;
        }
       }

       return count > arr.length/2 ? element : -1;
    }

}
