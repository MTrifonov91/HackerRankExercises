package week_3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_3.MockTest.getTotalX;

class MockTestTest {

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void testGetTotalX(List<Integer> inputA, List<Integer> inputB, int expected) {
        assertEquals(expected, getTotalX(inputA, inputB));
    }

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of(List.of(2, 4), List.of(16, 32, 96), 3)
        );
    }
}