package week_2;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int valleysCount = 0;
        int level = 0;
        boolean valleyStarted = false;

        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'D') {
                level--;
            }
            if (path.charAt(i) == 'U') {
                level++;
            }
            if (level < 0) {
                valleyStarted = true;
            }
            if (valleyStarted && level == 0) {
                valleysCount++;
                valleyStarted = false;
            }
        }
        return valleysCount;
    }
}
