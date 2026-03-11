package week_1;

import java.util.*;

public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> matchingStringsCount = new ArrayList<>();

        for(int i = 0; i < queries.size(); i++) {
            int temp = 0;
            for (int j = 0; j < strings.size(); j++) {
                if(queries.get(i).equals(strings.get(j))) {
                    temp++;
                }
            }
            matchingStringsCount.add(temp);
        }

        return matchingStringsCount;
    }

    public static List<Integer> matchingStringsOptimised(List<String> strings, List<String> queries) {
        Map<String, Integer> counts = new HashMap<>();
        for (String s : strings) {
            counts.put(s, counts.getOrDefault(s, 0) + 1);
        }

        List<Integer> matchingStringsCount = new ArrayList<>();
        for (String q : queries) {
            matchingStringsCount.add(counts.getOrDefault(q, 0));
        }
        return matchingStringsCount;
    }
}
