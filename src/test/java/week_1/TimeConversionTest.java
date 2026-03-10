package week_1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static week_1.TimeConversion.timeConversion;

class TimeConversionTest {

    @ParameterizedTest
    @CsvSource({"07:05:45PM, 19:05:45"})
    void testTimeConversion(String input, String expected) {
        String actual = timeConversion(input);
        assertEquals(expected, actual);
    }

}