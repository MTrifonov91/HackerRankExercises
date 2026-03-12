package week_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_2.DiagonalDifference.diagonalDifference;

class DiagonalDifferenceTest {

    @ParameterizedTest
    @MethodSource("provideMatrices")
    void testDiagonalDifference(List<List<Integer>> input, int expected) {
        assertEquals(expected, diagonalDifference(input));
    }

    static Stream<Arguments> provideMatrices() {
        return Stream.of(
                Arguments.of(
                        List.of(
                                List.of(11, 2, 4),
                                List.of(4, 5, 6),
                                List.of(10, 8, -12)
                        ),
                        15
                ),
                Arguments.of(
                        List.of(
                                List.of(0, 0, 10, 3),
                                List.of(5, 5, 7, 10),
                                List.of(5, 50, 88, 4),
                                List.of(15, 5, 77, 44)
                        ),
                        62
                )
        );
    }
}