package week_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_2.MarsExploration.marsExploration;

class MarsExplorationTest {

    @ParameterizedTest
    @CsvSource({"SOSTOT, 2",
            "SOSTOS, 1",
            "SOSSPSSQSSOR, 3",
            "TORSKS, 3",
            "SOS, 0"})
    void testMarsExploration(String input, int expected) {
        assertEquals(expected, marsExploration(input));
    }
}