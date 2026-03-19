package week_4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_4.PickingNumbers.pickingNumbers;

class PickingNumbersTest {

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void testPickingNumbers(List<Integer> inputList, int expected) {
        assertEquals(expected, pickingNumbers(inputList));
    }

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of(List.of(1, 1, 2, 2, 4, 4, 5, 5, 5), 5)
        );
    }
}