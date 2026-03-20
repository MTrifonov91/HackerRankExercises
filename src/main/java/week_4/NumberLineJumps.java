package week_4;

public class NumberLineJumps {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here

        int x = Math.abs(x1 - x2);
        int initial = Math.abs(x1 - x2);
        if (x == 0) {
            return "YES";
        }
        if (v1 == v2) {
            return "NO";
        }

        while (x <= initial) {
            x1 += v1;
            x2 += v2;
            x = Math.abs(x1 - x2);
            if (x == 0) {
                return "YES";
            }
        }
        return "NO";
    }
}
