package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            map.computeIfAbsent(strs[i]
                                .chars()
                                .sorted()
                                .mapToObj(
                                    c -> String.valueOf((char)c))
                                    .collect(Collectors.joining()
                                    ),
                               k -> new ArrayList<>()).add(strs[i]); 
        }
        System.out.println( new ArrayList<List<String>>(map.values()));
        return new ArrayList<List<String>>(map.values());
    }
}
