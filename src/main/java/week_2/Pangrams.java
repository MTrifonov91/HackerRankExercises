package week_2;

public class Pangrams {

    public static String pangrams(String s) {
        // Write your code here
        boolean hasAll = java.util.stream.IntStream.rangeClosed('a', 'z')
                .allMatch(c -> s.toLowerCase().indexOf(c) >= 0);

        return hasAll ? "pangram" : "not pangram";
    }
}
