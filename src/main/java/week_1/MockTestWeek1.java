package week_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MockTestWeek1 {

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        List<Integer> sortedList = new ArrayList<>(arr);
        sortedList.sort(Comparator.naturalOrder());

        return sortedList.get(sortedList.size() / 2);
    }
}
