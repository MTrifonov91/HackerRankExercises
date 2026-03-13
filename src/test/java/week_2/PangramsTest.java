package week_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_2.Pangrams.pangrams;

class PangramsTest {

    @ParameterizedTest
    @CsvSource({"The quick brown fox jumps over the lazy dog, pangram",
            "We promptly judged antique ivory buckles for the next prize, pangram",
            "We promptly judged antique ivory buckles for the prize, not pangram"})
    void testPangrams(String input, String expected) {
        assertEquals(expected, pangrams(input));
    }
}