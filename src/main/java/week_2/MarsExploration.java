package week_2;

public class MarsExploration {

    public static int marsExploration(String s) {
        // Write your code here
        int numberOfScrambledChars = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 3 == 1) {
                if (s.charAt(i) != 'O') {
                    numberOfScrambledChars++;
                }
            } else {
                if (s.charAt(i) != 'S') {
                    numberOfScrambledChars++;
                }
            }
        }
        return numberOfScrambledChars;
    }
}
