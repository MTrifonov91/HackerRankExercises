package week_3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumPerimeterTriangle {

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        // Write your code here
        List<Integer> sortedSticks = sticks.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        for (int i = sortedSticks.size() - 1; i >= 2; i--) {
            int a = sortedSticks.get(i - 2);
            int b = sortedSticks.get(i - 1);
            int c = sortedSticks.get(i);

            if ((a + b) > c) {
                return List.of(a, b, c);
            }
        }
        return List.of(-1);
    }
}
