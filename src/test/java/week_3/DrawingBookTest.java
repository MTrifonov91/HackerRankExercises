package week_3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_3.DrawingBook.pageCount;

class DrawingBookTest {

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void testPageCount(int inputN, int inputP, int expected) {
        assertEquals(expected, pageCount(inputN, inputP));
    }

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of(5, 3, 1),
                Arguments.of(5, 4, 0),
                Arguments.of(55, 21, 10)
        );
    }
}