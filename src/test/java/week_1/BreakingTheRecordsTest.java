package week_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_1.BreakingTheRecords.breakingRecords;

class BreakingTheRecordsTest {

    @ParameterizedTest
    @MethodSource("provideTestData")
    void testBreakingRecords(List<Integer> input, List<Integer> expected) {
        List<Integer> actual = breakingRecords(input);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(
                        new ArrayList<>(List.of(12, 24, 10, 24)),
                        new ArrayList<>(List.of(1, 1)
                        ))
        );
    }
}