package week_3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_3.MigratoryBirds.migratoryBirds;

class MigratoryBirdsTest {

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void testMigratoryBirds(List<Integer> input, int expected) {
        assertEquals(expected, migratoryBirds(input));
    }

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of(List.of(1, 1, 2, 2, 3), 1),
                Arguments.of(List.of(10, 20, 20, 10, 10, 30, 50, 10, 20), 10)
        );
    }
}