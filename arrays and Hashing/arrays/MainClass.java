package arrays;

import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        ContainsDuplicateSolution containsDuplicateSolution = new ContainsDuplicateSolution(); 
        CheckAnagram checkAnagram = new CheckAnagram();
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        TopKElements topKElements = new TopKElements();
        EncodeAndDecode encodeAndDecode = new EncodeAndDecode();
        TwoSum twoSum = new TwoSum();
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        String[] str = {"abc","cba","def","fed"};
        String firstString= "abc";
        String secondString = "cba";
        System.out.println(containsDuplicateSolution.containsDuplicate(arr));
        System.out.println(checkAnagram.isAnagram(firstString,secondString));
        System.out.println(twoSum.twoSum(arr, 2));
        System.out.println(topKElements.topKFrequent(arr, 3));
        System.out.println(encodeAndDecode.decode(encodeAndDecode.encode(Arrays.asList(str))));
        groupAnagrams.groupAnagrams(str);

    }
}
