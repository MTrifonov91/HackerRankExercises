package week_1;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlusMinus {

    public static List<Double> plusMinus(List<Integer> arr) {
        List<Integer> positiveIntegers = arr.stream()
                .filter(number -> number > 0)
                .toList();

        List<Integer> negativeIntegers = arr.stream()
                .filter(number -> number < 0)
                .toList();

        List<Integer> zeroes = arr.stream()
                .filter(number -> number == 0)
                .toList();

        double totalCount = (long) arr.size();
        double positivesCount = (long) positiveIntegers.size();
        double negativesCount = (long) negativeIntegers.size();
        double zeroesCount = (long) zeroes.size();

        double positiveRatio = positivesCount / totalCount;
        System.out.println(positiveRatio);
        System.out.println(negativesCount / totalCount);
        System.out.println(zeroesCount / totalCount);
        List<Double> result = new ArrayList<>();
        result.add(positiveRatio);
        result.add(negativesCount / totalCount);
        result.add(zeroesCount / totalCount);

        return result;
    }
}
