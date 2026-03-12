package week_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static week_2.LonelyInteger.lonelyInteger;

class LonelyIntegerTest {

    @ParameterizedTest
    @MethodSource("provider")
    void testLonelyInteger(List<Integer> input, int expected) {
        assertEquals(expected, lonelyInteger(input));
    }

    static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(1, 2, 3, 4, 3, 2, 1)), 4)
        );
    }
}