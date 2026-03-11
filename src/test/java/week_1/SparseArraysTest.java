package week_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week_1.SparseArrays.matchingStrings;
import static week_1.SparseArrays.matchingStringsOptimised;

class SparseArraysTest {

    @ParameterizedTest
    @MethodSource("listProvider")
    void testMatchingStrings(List<String> strings, List<String> queries, List<Integer> result) {
        assertEquals(result, matchingStrings(strings, queries));
    }

    @ParameterizedTest
    @MethodSource("listProvider")
    void testMatchingStringsOptimised(List<String> strings, List<String> queries, List<Integer> result) {
        assertEquals(result, matchingStringsOptimised(strings, queries));
    }

    static Stream<Arguments> listProvider() {
        return Stream.of(
                Arguments.of(
                        List.of("aba", "baba", "aba", "xzxb"),       // Input List 1 (String)
                        List.of("aba", "xzxb", "ab"),        // Input List 2 (String)
                        List.of(2, 1, 0)               // Expected Result (Integer)
                ),
                Arguments.of(
                        List.of("def", "de", "fgh"),
                        List.of("de", "lmn", "fgh"),
                        List.of(1, 0, 1)
                )
        );
    }
}