package week_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_1.MinMaxSum.miniMaxSum;

class MinMaxSumTest {

    @ParameterizedTest
    @MethodSource("provideTestData")
    void testMiniMaxSum(List<Integer> input, List<Long> expected) {
        List<Long> actual = miniMaxSum(input);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(
                        new ArrayList<>(List.of(1, 2, 3, 4, 5)),
                        new ArrayList<>(List.of(10L, 14L))
                )
        );
    }
}