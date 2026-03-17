package week_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_2.MockTestWeek2.flippingMatrix;

class MockTestWeek2Test {

    @ParameterizedTest
    @MethodSource("provideMatrices")
    void testFlippingMatrix(List<List<Integer>> input, int expected) {
        assertEquals(expected, flippingMatrix(input));
    }

    static Stream<Arguments> provideMatrices() {
        return Stream.of(
                Arguments.of(
                        List.of(
                                List.of(0, 0, 10, 3),
                                List.of(5, 5, 7, 10),
                                List.of(5, 50, 88, 4),
                                List.of(15, 5, 77, 44)
                        ),
                        219
                ),
                Arguments.of(
                        List.of(
                                List.of(112, 42, 83, 119),
                                List.of(56, 125, 56, 49),
                                List.of(15, 78, 101, 43),
                                List.of(62, 98, 114, 108)
                        ),
                        414
                ),
                Arguments.of(
                        List.of(
                                List.of(100, 0, 0, 1),
                                List.of(0, 0, 0, 0),
                                List.of(0, 0, 0, 0),
                                List.of(1, 0, 0, 100)
                        ),
                        100
                )
        );

    }
}