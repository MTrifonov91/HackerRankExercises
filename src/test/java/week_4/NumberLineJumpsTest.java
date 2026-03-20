package week_4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_4.NumberLineJumps.kangaroo;

class NumberLineJumpsTest {

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void testKangaroo(int x1, int v1, int x2, int v2, String result) {
        assertEquals(result, kangaroo(x1, v1, x2, v2));
    }

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of(2, 1, 1, 2, "YES"),
                Arguments.of(3, 1, 1, 2, "YES"),
                Arguments.of(3, 1, 1, 4, "NO"),
                Arguments.of(3, 1, 0, 4, "YES"),
                Arguments.of(43, 2, 70, 2, "NO")
        );
    }

}