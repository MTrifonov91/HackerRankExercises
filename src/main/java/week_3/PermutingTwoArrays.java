package week_3;

import java.util.Comparator;
import java.util.List;

public class PermutingTwoArrays {

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        int size = A.size();
        int count = 0;
        List<Integer> sortedA = A.stream()
                .sorted(Comparator.naturalOrder())
                .toList();

        List<Integer> sortedB = B.stream()
                .sorted(Comparator.naturalOrder())
                .toList();

        for (int i = 0; i < A.size(); i++) {
            if (sortedA.get(i) + sortedB.get(size - 1 - i) >= k) {
                count++;
            }
        }
        if (count == size) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
