package week_4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PickingNumbers {

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here

        List<Integer> sortedList = a.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < sortedList.size(); right++) {
            while (sortedList.get(right) - sortedList.get(left) > 1) {
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
