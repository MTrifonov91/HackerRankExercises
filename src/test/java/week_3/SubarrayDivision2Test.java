package week_3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_3.SubarrayDivision2.birthday;

class SubarrayDivision2Test {

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void testBirthday(List<Integer> inputList, int inputD, int inputM, int expected) {
        assertEquals(expected, birthday(inputList, inputD, inputM));
    }

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of(List.of(2, 2, 1, 3, 2), 4, 2, 2),
                Arguments.of(List.of(1, 1, 1, 1, 1, 1), 3, 2, 0)
        );
    }
}