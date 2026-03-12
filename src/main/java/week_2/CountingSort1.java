package week_2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingSort1 {

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here

        List<Integer> resultArray = Stream.generate(() -> 0)
                .limit(100)
                .collect(Collectors.toList());

        for (int i = 0; i < arr.size(); i++) {

            resultArray.set(arr.get(i), resultArray.get(arr.get(i)) + 1);
        }

        return resultArray;
    }
}
