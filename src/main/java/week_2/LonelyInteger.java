package week_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {

    public static int lonelyInteger(List<Integer> input) {
        Map<Integer, Integer> counts = new HashMap<>();
        input.forEach(i -> counts.merge(i, 1, Integer::sum));

        List<Integer> uniqueOnes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueOnes.add(entry.getKey());
            }
        }
        return uniqueOnes.getFirst();
    }

}
