package StriversArraysAndHashing;

import java.util.HashSet;

public class LongestConsecutiveSubsequences {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {102, 4, 100,1, 101,3,2,1,1};
        System.out.println(findLongestConsecutiveSubsequences(arr,set));
    }

    public static int findLongestConsecutiveSubsequences(int[] arr, HashSet<Integer>set){
        int result = 0, maxResult = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }

        for(int a : set){
            if(set.contains(a-1)){
                continue;
            }
            else{
                while(set.contains(a)){
                    result++;
                    a++;
                }
                maxResult = Math.max(result, maxResult);
                result = 0;
            }
        }
        return maxResult;
    }
}
