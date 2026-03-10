package week_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinMaxSum {

    public static List<Long> miniMaxSum(List<Integer> arr) {
        long sumAll = arr.stream()
                .mapToLong(Integer::intValue)
                .sum();

        arr.sort(Comparator.naturalOrder());
        long sumSmall = sumAll - arr.get(arr.size() - 1);
        long sumBig = sumAll - arr.get(0);
        return new ArrayList<>(List.of(sumSmall, sumBig));
    }
}
