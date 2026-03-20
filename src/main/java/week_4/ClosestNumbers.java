package week_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {

    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here
        List<Integer> sorted = new ArrayList<>(arr);
        Collections.sort(sorted);

        List<Integer> result = new ArrayList<>();
        int minDiff = sorted.get(1) - sorted.get(0);

        result.add(sorted.get(0));
        result.add(sorted.get(1));

        for (int i = 1; i < sorted.size() - 1; i++) {
            int a = sorted.get(i);
            int b = sorted.get(i + 1);
            int diff = b - a; // sorted, so no Math.abs needed

            if (diff < minDiff) {
                minDiff = diff;
                result.clear();
                result.add(a);
                result.add(b);
            } else if (diff == minDiff) {
                result.add(a);
                result.add(b);
            }
        }

        return result;
    }
}
