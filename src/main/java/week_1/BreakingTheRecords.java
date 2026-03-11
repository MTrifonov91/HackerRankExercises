package week_1;

import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int min = scores.get(0);
        int max = scores.get(0);

        int minBreaks = 0;
        int maxbreaks = 0;

        for (int i = 1; i < scores.size(); i++) {
            int current = scores.get(i);
            if (current > max) {
                max = current;
                maxbreaks++;
            } else if (current < min) {
                min = current;
                minBreaks++;
            }
        }
        return Arrays.asList(maxbreaks, minBreaks);

    }
}
