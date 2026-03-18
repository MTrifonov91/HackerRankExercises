package week_3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> birdTypeCount = new HashMap<>();

        for (int birdType : arr) {
            birdTypeCount.put(birdType, birdTypeCount.getOrDefault(birdType, 0) + 1);
        }

        int key = birdTypeCount.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        return key;
    }
}
