package week_4;

import java.util.ArrayList;
import java.util.List;

public class LeftRotaion {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here

        int size = arr.size();
        int temp = 0;
        List<Integer> rotatedList = new ArrayList<>(arr.size());
        for (int i = 0; i < size; i++) {
            if (i + d < size) {
                rotatedList.add(arr.get(i + d));
            } else {
                rotatedList.add(arr.get(temp));
                temp++;
            }
        }
        return rotatedList;
    }
}
