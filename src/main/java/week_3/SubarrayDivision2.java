package week_3;

import java.util.List;

public class SubarrayDivision2 {

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count = 0;
        int length = s.size();

        if (m > length) return 0;

        int windowSum = 0;
        for (int i = 0; i < m; i++) {
            windowSum += s.get(i);
        }

        if (windowSum == d) count++;

        for (int i = m; i < length; i++) {
            windowSum += s.get(i);
            windowSum -= s.get(i - m);

            if (windowSum == d) count++;
        }
        return count;
    }
}
