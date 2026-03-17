package week_3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_3.PermutingTwoArrays.twoArrays;

class PermutingTwoArraysTest {

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void testTwoArrays(int inputK, List<Integer> inputA, List<Integer> inputB, String expected) {
        assertEquals(expected, twoArrays(inputK, inputA, inputB));
    }

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of(10, List.of(2, 1, 3), List.of(7, 8, 9), "YES"),
                Arguments.of(5, List.of(1, 2, 2, 1), List.of(3, 3, 3, 4), "NO")
        );
    }
}