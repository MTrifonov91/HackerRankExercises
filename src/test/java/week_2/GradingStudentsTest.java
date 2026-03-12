package week_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_2.GradingStudents.gradingStudents;

class GradingStudentsTest {

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void testGradingStudents(List<Integer> input, List<Integer> expected) {
        assertEquals(expected, gradingStudents(input));
    }

    private static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of(
                        new ArrayList<>(List.of(84, 29, 40, 57, 68, 38)),
                        new ArrayList<>(List.of(85, 29, 40, 57, 70, 40))
                )
        );
    }
}