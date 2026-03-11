package week_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_1.PlusMinus.plusMinus;

class PlusMinusTest {

    @ParameterizedTest()
    @MethodSource("testValuesFromStreams")
    void testPlusMinus(List<Integer> arr, List<Double> result) {
        List<Double> actual = plusMinus(arr);
        assertEquals(result.size(), actual.size(), "List sizes must match");

        for (int i = 0; i < result.size(); i++) {
            assertEquals(result.get(i), actual.get(i), 0.00001);
        }
    }

    private static Stream<Arguments> testValuesFromStreams() {
        return Stream.of(
                Arguments.of(
                        List.of(-4, 3, -9, 0, 4, 1),      // List<Integer>
                        List.of(0.500000, 0.333333, 0.166667) // List<Double>
                )
        );
    }
}