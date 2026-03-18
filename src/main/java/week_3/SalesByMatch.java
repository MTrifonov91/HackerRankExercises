package week_3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Map<Integer, Integer> colorCount = new HashMap<>();

        for (int sock : ar) {
            colorCount.put(sock, colorCount.getOrDefault(sock, 0) + 1);
        }

        int pairs = 0;

        for (int count : colorCount.values()) {
            pairs += count / 2;
        }

        return pairs;
    }
}
