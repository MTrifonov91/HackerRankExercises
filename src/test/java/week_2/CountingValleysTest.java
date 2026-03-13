package week_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_2.CountingValleys.countingValleys;

class CountingValleysTest {

    @ParameterizedTest
    @CsvSource({"8, UDDDUDUU, 1",
            "10, DDUUDDUUDD, 2",
            "12, DDUUDDUDUUUD, 2"})
    void testCountingValleys(int inputSteps, String inputPath, int expected) {
        assertEquals(expected, countingValleys(inputSteps, inputPath));
    }
}