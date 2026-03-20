package week_4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_4.LeftRotaion.rotateLeft;

class LeftRotaionTest {

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void testRotateLeft(List<Integer> intputList, int rotations, List<Integer> expectedList) {
        assertEquals(expectedList, rotateLeft(rotations, intputList));
    }

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4, 5), 2, List.of(3, 4, 5, 1, 2))
        );
    }
}