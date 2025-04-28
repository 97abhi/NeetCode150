package arrays;

import java.util.HashSet;
import java.util.Set;

public class TopKElements {
public int[] topKFrequent(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            set.add(i);
        }

        return set.stream().limit(k).mapToInt(Integer :: intValue).toArray();
        }
}
