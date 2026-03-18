package week_3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_3.SalesByMatch.sockMerchant;

class SalesByMatchTest {

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void testSockMerchant(int inputLength, List<Integer> inputArray, int expected) {
        assertEquals(expected, sockMerchant(inputLength, inputArray));
    }

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of(7, List.of(1, 2, 1, 2, 1, 3, 2), 2),
                Arguments.of(9, List.of(10, 20, 20, 10, 10, 30, 50, 10, 20), 3)
        );
    }
}