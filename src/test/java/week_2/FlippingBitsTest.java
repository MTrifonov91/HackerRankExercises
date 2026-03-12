package week_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_2.FlippingBits.flippingBits;

class FlippingBitsTest {

    @ParameterizedTest
    @CsvSource({"2147483647 , 2147483648",
            "1, 4294967294",
            "0, 4294967295"})
    void testFlippingBits(long input, long expected) {
        assertEquals(expected, flippingBits(input));
    }
}