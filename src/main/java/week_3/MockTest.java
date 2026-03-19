package week_3;

import java.util.List;

public class MockTest {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int lcmA = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            lcmA = lcm(lcmA, a.get(i));
        }

        int gcdB = b.get(0);
        for (int i = 1; i < b.size(); i++) {
            gcdB = gcd(gcdB, b.get(i));
        }

        int count = 0;
        for (int multiple = lcmA; multiple <= gcdB; multiple += lcmA) {
            if (gcdB % multiple == 0) {
                count++;
            }
        }

        return count;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

}
