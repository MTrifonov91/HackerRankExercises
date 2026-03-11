package week_1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static week_1.MockTestWeek1.findMedian;

class MockTestWeek1Test {

    @ParameterizedTest
    @MethodSource("testDataProider")
    void testFindMedian(List<Integer> input, int expected) {
        assertEquals(expected, findMedian(input));
    }

    private static Stream<Arguments> testDataProider() {
        return Stream.of(
                Arguments.of(List.of(0, 2, 1, 4, 5, 3, 6), 3)
        );
    }
}