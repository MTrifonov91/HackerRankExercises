package week_2;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int diagX = 0;
        int diagY = 0;
        int diagDiff;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (i == j) {
                    diagX += arr.get(i).get(j);
                }
                if (i + j == arr.size() - 1) {
                    diagY += arr.get(i).get(j);
                }
            }
        }
        diagDiff = diagX - diagY;
        return Math.abs(diagDiff);
    }
}
