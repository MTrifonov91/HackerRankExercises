package week_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class DivisibleSumPairsTest {

    @ParameterizedTest
    @MethodSource("provider")
    void divisibleSumPairs() {

    }

    static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(6, 3, new ArrayList<>(List.of(1, 3, 2, 6, 1, 2)), 5)
        );
    }
}