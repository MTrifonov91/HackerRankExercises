package week_4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_4.ClosestNumbers.closestNumbers;

class ClosestNumbersTest {

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void testClosestNumbers(List<Integer> inputList, List<Integer> expectedList) {
        assertEquals(expectedList, closestNumbers(inputList));
    }

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of(List.of(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854), List.of(-20, 30))
        );
    }
}