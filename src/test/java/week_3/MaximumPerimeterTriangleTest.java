package week_3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_3.MaximumPerimeterTriangle.maximumPerimeterTriangle;

class MaximumPerimeterTriangleTest {

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void testMaximumPerimeterTriangle(List<Integer> inputList, List<Integer> expectedList) {
        assertEquals(expectedList, maximumPerimeterTriangle(inputList));
    }

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4, 5, 10), List.of(3, 4, 5))
        );
    }
}